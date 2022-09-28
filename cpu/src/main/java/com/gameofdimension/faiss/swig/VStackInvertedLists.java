/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class VStackInvertedLists extends ReadOnlyInvertedLists {
  private transient long swigCPtr;

  protected VStackInvertedLists(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.VStackInvertedLists_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VStackInvertedLists obj) {
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
        swigfaissJNI.delete_VStackInvertedLists(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setIls(SWIGTYPE_p_std__vectorT_faiss__InvertedLists_const_p_t value) {
    swigfaissJNI.VStackInvertedLists_ils_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_faiss__InvertedLists_const_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_faiss__InvertedLists_const_p_t getIls() {
    long cPtr = swigfaissJNI.VStackInvertedLists_ils_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_faiss__InvertedLists_const_p_t(cPtr, false);
  }

  public void setCumsz(SWIGTYPE_p_std__vectorT_long_long_t value) {
    swigfaissJNI.VStackInvertedLists_cumsz_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_long_long_t getCumsz() {
    long cPtr = swigfaissJNI.VStackInvertedLists_cumsz_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_long_long_t(cPtr, false);
  }

  public VStackInvertedLists(int nil, SWIGTYPE_p_p_faiss__InvertedLists ils) {
    this(swigfaissJNI.new_VStackInvertedLists(nil, SWIGTYPE_p_p_faiss__InvertedLists.getCPtr(ils)), true);
  }

  public long list_size(long list_no) {
    return swigfaissJNI.VStackInvertedLists_list_size(swigCPtr, this, list_no);
  }

  public SWIGTYPE_p_unsigned_char get_codes(long list_no) {
    long cPtr = swigfaissJNI.VStackInvertedLists_get_codes(swigCPtr, this, list_no);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public SWIGTYPE_p_long_long get_ids(long list_no) {
    long cPtr = swigfaissJNI.VStackInvertedLists_get_ids(swigCPtr, this, list_no);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long_long(cPtr, false);
  }

  public void release_codes(long list_no, SWIGTYPE_p_unsigned_char codes) {
    swigfaissJNI.VStackInvertedLists_release_codes(swigCPtr, this, list_no, SWIGTYPE_p_unsigned_char.getCPtr(codes));
  }

  public void release_ids(long list_no, SWIGTYPE_p_long_long ids) {
    swigfaissJNI.VStackInvertedLists_release_ids(swigCPtr, this, list_no, SWIGTYPE_p_long_long.getCPtr(ids));
  }

  public long get_single_id(long list_no, long offset) {
    return swigfaissJNI.VStackInvertedLists_get_single_id(swigCPtr, this, list_no, offset);
  }

  public SWIGTYPE_p_unsigned_char get_single_code(long list_no, long offset) {
    long cPtr = swigfaissJNI.VStackInvertedLists_get_single_code(swigCPtr, this, list_no, offset);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void prefetch_lists(SWIGTYPE_p_long_long list_nos, int nlist) {
    swigfaissJNI.VStackInvertedLists_prefetch_lists(swigCPtr, this, SWIGTYPE_p_long_long.getCPtr(list_nos), nlist);
  }

}
