/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btConvexCast {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btConvexCast (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btConvexCast obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConvexCast(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public boolean calcTimeOfImpact (btTransform fromA, btTransform toA, btTransform fromB, btTransform toB,
		SWIGTYPE_p_btConvexCast__CastResult result) {
		return gdxBulletJNI.btConvexCast_calcTimeOfImpact(swigCPtr, this, btTransform.getCPtr(fromA), fromA,
			btTransform.getCPtr(toA), toA, btTransform.getCPtr(fromB), fromB, btTransform.getCPtr(toB), toB,
			SWIGTYPE_p_btConvexCast__CastResult.getCPtr(result));
	}

}
