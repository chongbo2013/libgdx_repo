/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btHingeConstraintFloatData {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btHingeConstraintFloatData (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btHingeConstraintFloatData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btHingeConstraintFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_typeConstraintData (btTypedConstraintData value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value),
			value);
	}

	public btTypedConstraintData getM_typeConstraintData () {
		long cPtr = gdxBulletJNI.btHingeConstraintFloatData_m_typeConstraintData_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
	}

	public void setM_rbAFrame (btTransformFloatData value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
	}

	public btTransformFloatData getM_rbAFrame () {
		long cPtr = gdxBulletJNI.btHingeConstraintFloatData_m_rbAFrame_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
	}

	public void setM_rbBFrame (btTransformFloatData value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
	}

	public btTransformFloatData getM_rbBFrame () {
		long cPtr = gdxBulletJNI.btHingeConstraintFloatData_m_rbBFrame_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
	}

	public void setM_useReferenceFrameA (int value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_useReferenceFrameA_set(swigCPtr, this, value);
	}

	public int getM_useReferenceFrameA () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_useReferenceFrameA_get(swigCPtr, this);
	}

	public void setM_angularOnly (int value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_angularOnly_set(swigCPtr, this, value);
	}

	public int getM_angularOnly () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_angularOnly_get(swigCPtr, this);
	}

	public void setM_enableAngularMotor (int value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_enableAngularMotor_set(swigCPtr, this, value);
	}

	public int getM_enableAngularMotor () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_enableAngularMotor_get(swigCPtr, this);
	}

	public void setM_motorTargetVelocity (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_motorTargetVelocity_set(swigCPtr, this, value);
	}

	public float getM_motorTargetVelocity () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_motorTargetVelocity_get(swigCPtr, this);
	}

	public void setM_maxMotorImpulse (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_maxMotorImpulse_set(swigCPtr, this, value);
	}

	public float getM_maxMotorImpulse () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_maxMotorImpulse_get(swigCPtr, this);
	}

	public void setM_lowerLimit (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_lowerLimit_set(swigCPtr, this, value);
	}

	public float getM_lowerLimit () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_lowerLimit_get(swigCPtr, this);
	}

	public void setM_upperLimit (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_upperLimit_set(swigCPtr, this, value);
	}

	public float getM_upperLimit () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_upperLimit_get(swigCPtr, this);
	}

	public void setM_limitSoftness (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_limitSoftness_set(swigCPtr, this, value);
	}

	public float getM_limitSoftness () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_limitSoftness_get(swigCPtr, this);
	}

	public void setM_biasFactor (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_biasFactor_set(swigCPtr, this, value);
	}

	public float getM_biasFactor () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_biasFactor_get(swigCPtr, this);
	}

	public void setM_relaxationFactor (float value) {
		gdxBulletJNI.btHingeConstraintFloatData_m_relaxationFactor_set(swigCPtr, this, value);
	}

	public float getM_relaxationFactor () {
		return gdxBulletJNI.btHingeConstraintFloatData_m_relaxationFactor_get(swigCPtr, this);
	}

	public btHingeConstraintFloatData () {
		this(gdxBulletJNI.new_btHingeConstraintFloatData(), true);
	}

}
