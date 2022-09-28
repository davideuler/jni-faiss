/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class SlidingIndexWindow {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SlidingIndexWindow(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SlidingIndexWindow obj) {
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
        swigfaissJNI.delete_SlidingIndexWindow(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIndex(Index value) {
    swigfaissJNI.SlidingIndexWindow_index_set(swigCPtr, this, Index.getCPtr(value), value);
  }

  public Index getIndex() {
    long cPtr = swigfaissJNI.SlidingIndexWindow_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setIls(ArrayInvertedLists value) {
    swigfaissJNI.SlidingIndexWindow_ils_set(swigCPtr, this, ArrayInvertedLists.getCPtr(value), value);
  }

  public ArrayInvertedLists getIls() {
    long cPtr = swigfaissJNI.SlidingIndexWindow_ils_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ArrayInvertedLists(cPtr, false);
  }

  public void setN_slice(int value) {
    swigfaissJNI.SlidingIndexWindow_n_slice_set(swigCPtr, this, value);
  }

  public int getN_slice() {
    return swigfaissJNI.SlidingIndexWindow_n_slice_get(swigCPtr, this);
  }

  public void setNlist(long value) {
    swigfaissJNI.SlidingIndexWindow_nlist_set(swigCPtr, this, value);
  }

  public long getNlist() {
    return swigfaissJNI.SlidingIndexWindow_nlist_get(swigCPtr, this);
  }

  public void setSizes(SWIGTYPE_p_std__vectorT_std__vectorT_long_long_t_t value) {
    swigfaissJNI.SlidingIndexWindow_sizes_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__vectorT_long_long_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_std__vectorT_long_long_t_t getSizes() {
    long cPtr = swigfaissJNI.SlidingIndexWindow_sizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_std__vectorT_long_long_t_t(cPtr, false);
  }

  public SlidingIndexWindow(Index index) {
    this(swigfaissJNI.new_SlidingIndexWindow(Index.getCPtr(index), index), true);
  }

  public void step(Index sub_index, boolean remove_oldest) {
    swigfaissJNI.SlidingIndexWindow_step(swigCPtr, this, Index.getCPtr(sub_index), sub_index, remove_oldest);
  }

}
