/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btConstraintInfo2 {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btConstraintInfo2 (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btConstraintInfo2 obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConstraintInfo2(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFps (float value) {
		gdxBulletJNI.btConstraintInfo2_fps_set(swigCPtr, this, value);
	}

	public float getFps () {
		return gdxBulletJNI.btConstraintInfo2_fps_get(swigCPtr, this);
	}

	public void setErp (float value) {
		gdxBulletJNI.btConstraintInfo2_erp_set(swigCPtr, this, value);
	}

	public float getErp () {
		return gdxBulletJNI.btConstraintInfo2_erp_get(swigCPtr, this);
	}

	public void setM_J1linearAxis (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_J1linearAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_J1linearAxis () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_J1linearAxis_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setM_J1angularAxis (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_J1angularAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_J1angularAxis () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_J1angularAxis_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setM_J2linearAxis (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_J2linearAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_J2linearAxis () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_J2linearAxis_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setM_J2angularAxis (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_J2angularAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_J2angularAxis () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_J2angularAxis_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setRowskip (int value) {
		gdxBulletJNI.btConstraintInfo2_rowskip_set(swigCPtr, this, value);
	}

	public int getRowskip () {
		return gdxBulletJNI.btConstraintInfo2_rowskip_get(swigCPtr, this);
	}

	public void setM_constraintError (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_constraintError_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_constraintError () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_constraintError_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setCfm (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_cfm_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getCfm () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_cfm_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setM_lowerLimit (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_lowerLimit_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_lowerLimit () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_lowerLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setM_upperLimit (SWIGTYPE_p_float value) {
		gdxBulletJNI.btConstraintInfo2_m_upperLimit_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
	}

	public SWIGTYPE_p_float getM_upperLimit () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_m_upperLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
	}

	public void setFindex (SWIGTYPE_p_int value) {
		gdxBulletJNI.btConstraintInfo2_findex_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
	}

	public SWIGTYPE_p_int getFindex () {
		long cPtr = gdxBulletJNI.btConstraintInfo2_findex_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
	}

	public void setM_numIterations (int value) {
		gdxBulletJNI.btConstraintInfo2_m_numIterations_set(swigCPtr, this, value);
	}

	public int getM_numIterations () {
		return gdxBulletJNI.btConstraintInfo2_m_numIterations_get(swigCPtr, this);
	}

	public void setM_damping (float value) {
		gdxBulletJNI.btConstraintInfo2_m_damping_set(swigCPtr, this, value);
	}

	public float getM_damping () {
		return gdxBulletJNI.btConstraintInfo2_m_damping_get(swigCPtr, this);
	}

	public btConstraintInfo2 () {
		this(gdxBulletJNI.new_btConstraintInfo2(), true);
	}

}
