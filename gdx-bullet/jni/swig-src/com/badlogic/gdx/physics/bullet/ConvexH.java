/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class ConvexH {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected ConvexH (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (ConvexH obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_ConvexH(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public ConvexH () {
		this(gdxBulletJNI.new_ConvexH__SWIG_0(), true);
	}

	public void setVertices (SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t value) {
		gdxBulletJNI.ConvexH_vertices_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t.getCPtr(value));
	}

	public SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t getVertices () {
		long cPtr = gdxBulletJNI.ConvexH_vertices_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t(cPtr, false);
	}

	public void setEdges (SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t value) {
		gdxBulletJNI.ConvexH_edges_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t.getCPtr(value));
	}

	public SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t getEdges () {
		long cPtr = gdxBulletJNI.ConvexH_edges_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t(cPtr, false);
	}

	public void setFacets (SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t value) {
		gdxBulletJNI.ConvexH_facets_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t.getCPtr(value));
	}

	public SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t getFacets () {
		long cPtr = gdxBulletJNI.ConvexH_facets_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t(cPtr, false);
	}

	public ConvexH (int vertices_size, int edges_size, int facets_size) {
		this(gdxBulletJNI.new_ConvexH__SWIG_1(vertices_size, edges_size, facets_size), true);
	}

}
