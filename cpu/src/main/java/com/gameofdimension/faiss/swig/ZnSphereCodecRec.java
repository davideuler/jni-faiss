/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class ZnSphereCodecRec extends EnumeratedVectors {
  private transient long swigCPtr;

  protected ZnSphereCodecRec(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.ZnSphereCodecRec_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZnSphereCodecRec obj) {
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
        swigfaissJNI.delete_ZnSphereCodecRec(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setR2(int value) {
    swigfaissJNI.ZnSphereCodecRec_r2_set(swigCPtr, this, value);
  }

  public int getR2() {
    return swigfaissJNI.ZnSphereCodecRec_r2_get(swigCPtr, this);
  }

  public void setLog2_dim(int value) {
    swigfaissJNI.ZnSphereCodecRec_log2_dim_set(swigCPtr, this, value);
  }

  public int getLog2_dim() {
    return swigfaissJNI.ZnSphereCodecRec_log2_dim_get(swigCPtr, this);
  }

  public void setCode_size(int value) {
    swigfaissJNI.ZnSphereCodecRec_code_size_set(swigCPtr, this, value);
  }

  public int getCode_size() {
    return swigfaissJNI.ZnSphereCodecRec_code_size_get(swigCPtr, this);
  }

  public ZnSphereCodecRec(int dim, int r2) {
    this(swigfaissJNI.new_ZnSphereCodecRec(dim, r2), true);
  }

  public java.math.BigInteger encode_centroid(SWIGTYPE_p_float c) {
    return swigfaissJNI.ZnSphereCodecRec_encode_centroid(swigCPtr, this, SWIGTYPE_p_float.getCPtr(c));
  }

  public void decode(java.math.BigInteger code, SWIGTYPE_p_float c) {
    swigfaissJNI.ZnSphereCodecRec_decode(swigCPtr, this, code, SWIGTYPE_p_float.getCPtr(c));
  }

  public java.math.BigInteger encode(SWIGTYPE_p_float x) {
    return swigfaissJNI.ZnSphereCodecRec_encode(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x));
  }

  public void setAll_nv(SWIGTYPE_p_std__vectorT_unsigned_long_long_t value) {
    swigfaissJNI.ZnSphereCodecRec_all_nv_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_long_long_t getAll_nv() {
    long cPtr = swigfaissJNI.ZnSphereCodecRec_all_nv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_unsigned_long_long_t(cPtr, false);
  }

  public void setAll_nv_cum(SWIGTYPE_p_std__vectorT_unsigned_long_long_t value) {
    swigfaissJNI.ZnSphereCodecRec_all_nv_cum_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_long_long_t getAll_nv_cum() {
    long cPtr = swigfaissJNI.ZnSphereCodecRec_all_nv_cum_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_unsigned_long_long_t(cPtr, false);
  }

  public void setDecode_cache_ld(int value) {
    swigfaissJNI.ZnSphereCodecRec_decode_cache_ld_set(swigCPtr, this, value);
  }

  public int getDecode_cache_ld() {
    return swigfaissJNI.ZnSphereCodecRec_decode_cache_ld_get(swigCPtr, this);
  }

  public void setDecode_cache(FloatVectorVector value) {
    swigfaissJNI.ZnSphereCodecRec_decode_cache_set(swigCPtr, this, FloatVectorVector.getCPtr(value), value);
  }

  public FloatVectorVector getDecode_cache() {
    long cPtr = swigfaissJNI.ZnSphereCodecRec_decode_cache_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVectorVector(cPtr, false);
  }

  public java.math.BigInteger get_nv(int ld, int r2a) {
    return swigfaissJNI.ZnSphereCodecRec_get_nv(swigCPtr, this, ld, r2a);
  }

  public java.math.BigInteger get_nv_cum(int ld, int r2t, int r2a) {
    return swigfaissJNI.ZnSphereCodecRec_get_nv_cum(swigCPtr, this, ld, r2t, r2a);
  }

  public void set_nv_cum(int ld, int r2t, int r2a, java.math.BigInteger v) {
    swigfaissJNI.ZnSphereCodecRec_set_nv_cum(swigCPtr, this, ld, r2t, r2a, v);
  }

}
