/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class ThreadedIndexBase extends Index {
  private transient long swigCPtr;

  protected ThreadedIndexBase(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.ThreadedIndexBase_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ThreadedIndexBase obj) {
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
        swigfaissJNI.delete_ThreadedIndexBase(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addIndex(Index index) {
    swigfaissJNI.ThreadedIndexBase_addIndex(swigCPtr, this, Index.getCPtr(index), index);
  }

  public void removeIndex(Index index) {
    swigfaissJNI.ThreadedIndexBase_removeIndex(swigCPtr, this, Index.getCPtr(index), index);
  }

  public void runOnIndex(SWIGTYPE_p_std__functionT_void_fint_faiss__Index_pF_t f) {
    swigfaissJNI.ThreadedIndexBase_runOnIndex__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__functionT_void_fint_faiss__Index_pF_t.getCPtr(f));
  }

  public void runOnIndex(SWIGTYPE_p_std__functionT_void_fint_faiss__Index_const_pF_t f) {
    swigfaissJNI.ThreadedIndexBase_runOnIndex__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__functionT_void_fint_faiss__Index_const_pF_t.getCPtr(f));
  }

  public void reset() {
    swigfaissJNI.ThreadedIndexBase_reset(swigCPtr, this);
  }

  public int count() {
    return swigfaissJNI.ThreadedIndexBase_count(swigCPtr, this);
  }

  public Index at(int i) {
    long cPtr = swigfaissJNI.ThreadedIndexBase_at__SWIG_0(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.ThreadedIndexBase_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.ThreadedIndexBase_own_fields_get(swigCPtr, this);
  }

}
