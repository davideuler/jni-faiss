/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class IndexFlatL2BaseShift extends IndexFlatL2 {
  private transient long swigCPtr;

  protected IndexFlatL2BaseShift(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexFlatL2BaseShift_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexFlatL2BaseShift obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexFlatL2BaseShift(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setShift(FloatVector value) {
    swigfaissJNI.IndexFlatL2BaseShift_shift_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getShift() {
    long cPtr = swigfaissJNI.IndexFlatL2BaseShift_shift_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public IndexFlatL2BaseShift(long d, long nshift, SWIGTYPE_p_float shift) {
    this(swigfaissJNI.new_IndexFlatL2BaseShift(d, nshift, SWIGTYPE_p_float.getCPtr(shift)), true);
  }

  public void search(long n, SWIGTYPE_p_float x, long k, SWIGTYPE_p_float distances, SWIGTYPE_p_long_long labels) {
    swigfaissJNI.IndexFlatL2BaseShift_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long_long.getCPtr(labels));
  }

}