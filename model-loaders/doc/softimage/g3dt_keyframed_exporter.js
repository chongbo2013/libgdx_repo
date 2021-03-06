var VERSION = "g3dt-keyframed-1.0";

function WriteHeader(str) {
	return str + VERSION + "\n";
}

/**
	Returns an Array of PolygonMeshes based on
	the given String Array of mesh names.
*/
function GetMeshes(modelName, meshNames) {
	var result = new Array();
	for(var i = 0; i < meshNames.length; i++) {		
		var mesh = Dictionary.GetObject(modelName + "." + meshNames[i]);
		result[i] = mesh;
	}
	return result;
}

/**
	Fetches the UVs from the provided Clusters. The returned
	result is an array containing the UVW elements of each
	cluster.
**/
function GetUVs(clusters) {
	var result = new ActiveXObject("XSI.Collection");
	
	for(var i = 0; i < clusters.Count; i++) {
		var cluster = clusters(i);
		var uvSpace = null;
		for(var j = 0; j < cluster.Properties.Count; j++) {
			if(cluster.Properties(j).type == "uvspace") {				
				uvSpace = cluster.Properties(j);
				break;
			} 
		}	  

		if(uvSpace != null) {			
			var uvs = uvSpace.Elements.Array.toArray();
			result.add(uvs);
		}
	}
	return result;
}

function ExportGeometryFaces(geo) {
	var vertexId = 0;
	var out = geo.Polygons.Count + "\n";	
	for(var poly = 0; poly < geo.Polygons.Count; poly++) {
		var face = geo.Polygons(poly);		
		out += face.Vertices.Count;
		LogMessage("nodes: " + face.Nodes.Count + ", verts:" + face.Vertices.Count);
		for(var vert = 0; vert < face.Vertices.Count; vert++) {
			LogMessage(face.Nodes(vert).Index + ", " + face.Vertices(vert).Index);
			out += ", " + vertexId;
			vertexId++;
		}
		out += "\n";
	}
	out += vertexId + "\n";
	return out;
}

function ExportGeometryDescriptor(geo, exportNormals) {
	var uvs = GetUVs(geo.Clusters);
	
	var out = "";
	out += uvs.Count + (exportNormals?2:1) + "\n";
	out += "position\n";	
	if(exportNormals) out += "normals\n";
	for(var i = 0; i < uvs.Count; i++) {
		out += "uv\n";
		var uv = uvs(i);
		
		// new
		for(var poly = 0; poly < geo.Polygons.Count; poly++) {
			var face = geo.Polygons(poly);							
			for(var vert = 0; vert < face.Nodes.Count; vert++) {				
				var idx = face.Nodes(vert).Index;
				out += uv[idx*3] + "," + uv[idx*3+1] + "\n";
			}			
		}				
	}
	
	return out;
}

function ExportGeometry(geo, exportNormals) {	
	var out = "";
	var verts = 0;
	for(var poly = 0; poly < geo.Polygons.Count; poly++) {
		var face = geo.Polygons(poly);				
		for(var vert = 0; vert < face.Vertices.Count; vert++) {
			var vertex = face.Vertices(vert);
			var position = vertex.Position;
			var normal = vertex.Normal;
			out += position.X + "," + position.Y + "," + position.Z;
			if(exportNormals) out += "," + normal.X + "," + normal.X + "," + normal.Z;
			out += "\n";
			verts++;
		}
	}	
	return out;
}

function ExportKFX(fileName, modelName, meshNames, animationNames, exportNormals, frameStep) {
	if (typeof exportNormals == 'undefined' ) exportNormals = false;
	if (typeof frameStep == 'undefined' ) frameStep = 1;
	
	LogMessage("===========  Exporting model " + modelName + " to kfx");		
	// write the header
	var out = "";
	out = WriteHeader(out);

	// fetch all meshes and get their respective UVs
	var model = Dictionary.GetObject(modelName);
	var meshes = GetMeshes(modelName, meshNames);		

	out += meshes.length + "\n";
	
	// Go through each mesh, apply all animations and bake them
	for(var i = 0; i < meshes.length; i++) {
		var mesh = meshes[i];
		if(mesh.Primitives.Length > 1) {
			LogMessage("Mesh '" + mesh.Name + "' has more than one PolygonMesh!");
		}			
		out += mesh.Name + "\n";		
		out += ExportGeometryFaces(mesh.Primitives(0).Geometry);
		out += ExportGeometryDescriptor(mesh.Primitives(0).Geometry, exportNormals);				
		out += animationNames.length + "\n";
		// Go through each animation specified in animationNames
		// and bake this mesh.		
		for(var j = 0; j < model.Sources.Count; j++) {			
			var source = model.Sources(j);
			var action = model.FullNAme + ".Mixer." + source.Name;	
			LogMessage("Checking source " + source.Name );
			var found = false;
			for(var k = 0; k < animationNames.length; k++) {
				if(animationNames[k] == source.Name) {
					found = true;
					break;
				}
			}			
			if(!found) {
				LogMessage("Skipping animation '" + source.Name + "'");
				continue;
			}
			
			ApplyAction(action);			
			var frameStart = source.Parameters("FrameStart").Value;
			var frameEnd = source.Parameters("FrameEnd").Value;
			var frames = Math.floor((frameEnd - frameStart + 1) * frameStep);
			var fs = (frameEnd - frameStart + 1) / frames;
			out += source.Name + "\n";
			out += frames + "\n";
			LogMessage("original frames: " + (frameEnd - frameStart + 1) + ", " + frameStart + ", " + frameEnd);
			LogMessage("exported frames: " + frames);
			LogMessage("frame step: " + fs);
			out += (source.Parameters("AnimEnd").Value - source.Parameters("AnimStart").Value) / frames + "\n";			
			var frameTime = frameStart;
			for(var frame = 0; frame < frames; frame++) {
				if(frame == frames -1) frameTime = frameEnd;				
				LogMessage("Baking frame " + frame + " for mesh " + mesh.Name + ", animation " + source.Name + ", frame time: " + frameTime);
				var geo = mesh.ActivePrimitive.Geometry(frameTime);				
				out += ExportGeometry(geo, exportNormals);
				frameTime += fs;
			}						
		}
	}
	
	var fso  = new ActiveXObject("Scripting.FileSystemObject"); 
	var fh = fso.CreateTextFile(fileName, true); 
	fh.WriteLine(out); 
	fh.Close();
	
	LogMessage("Done");
} 

//ExportKFX("C:\\workspace\\libgdx\\extensions\\model-loaders\\data\\cylinder.g3dt", "Cylinder", ["grid"], ["Anim1", "Anim2"]);
//ExportKFX("C:\\workspace\\libgdx\\extensions\\model-loaders\\data\\cylinder_low.g3dt", "Cylinder", ["cylinder"], ["Bend1", "Bend2"], false, 0.5);
ExportKFX("C:\\workspace\\libgdx\\extensions\\model-loaders\\data\\boy_low2.g3dt", "Boy", ["Boy_lowpoly_mesh"], ["Run"], false, 0.25);