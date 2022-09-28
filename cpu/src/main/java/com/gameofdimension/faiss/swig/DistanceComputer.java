/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class DistanceComputer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DistanceComputer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DistanceComputer obj) {
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
        swigfaissJNI.delete_DistanceComputer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_query(SWIGTYPE_p_float x) {
    swigfaissJNI.DistanceComputer_set_query(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x));
  }

  public float symmetric_dis(long i, long j) {
    return swigfaissJNI.DistanceComputer_symmetric_dis(swigCPtr, this, i, j);
  }

}
