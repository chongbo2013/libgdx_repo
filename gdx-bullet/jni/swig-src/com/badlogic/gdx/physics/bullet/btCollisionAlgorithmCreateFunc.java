/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btCollisionAlgorithmCreateFunc {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btCollisionAlgorithmCreateFunc (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btCollisionAlgorithmCreateFunc obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCollisionAlgorithmCreateFunc(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_swapped (boolean value) {
		gdxBulletJNI.btCollisionAlgorithmCreateFunc_m_swapped_set(swigCPtr, this, value);
	}

	public boolean getM_swapped () {
		return gdxBulletJNI.btCollisionAlgorithmCreateFunc_m_swapped_get(swigCPtr, this);
	}

	public btCollisionAlgorithmCreateFunc () {
		this(gdxBulletJNI.new_btCollisionAlgorithmCreateFunc(), true);
	}

	public btCollisionAlgorithm CreateCollisionAlgorithm (btCollisionAlgorithmConstructionInfo arg0, btCollisionObject body0,
		btCollisionObject body1) {
		long cPtr = gdxBulletJNI.btCollisionAlgorithmCreateFunc_CreateCollisionAlgorithm(swigCPtr, this,
			btCollisionAlgorithmConstructionInfo.getCPtr(arg0), arg0, btCollisionObject.getCPtr(body0), body0,
			btCollisionObject.getCPtr(body1), body1);
		return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
	}

}
