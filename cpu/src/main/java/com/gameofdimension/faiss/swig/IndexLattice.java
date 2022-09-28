/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class IndexLattice extends Index {
  private transient long swigCPtr;

  protected IndexLattice(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexLattice_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexLattice obj) {
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
        swigfaissJNI.delete_IndexLattice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setNsq(int value) {
    swigfaissJNI.IndexLattice_nsq_set(swigCPtr, this, value);
  }

  public int getNsq() {
    return swigfaissJNI.IndexLattice_nsq_get(swigCPtr, this);
  }

  public void setDsq(long value) {
    swigfaissJNI.IndexLattice_dsq_set(swigCPtr, this, value);
  }

  public long getDsq() {
    return swigfaissJNI.IndexLattice_dsq_get(swigCPtr, this);
  }

  public void setZn_sphere_codec(ZnSphereCodecAlt value) {
    swigfaissJNI.IndexLattice_zn_sphere_codec_set(swigCPtr, this, ZnSphereCodecAlt.getCPtr(value), value);
  }

  public ZnSphereCodecAlt getZn_sphere_codec() {
    long cPtr = swigfaissJNI.IndexLattice_zn_sphere_codec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ZnSphereCodecAlt(cPtr, false);
  }

  public void setScale_nbit(int value) {
    swigfaissJNI.IndexLattice_scale_nbit_set(swigCPtr, this, value);
  }

  public int getScale_nbit() {
    return swigfaissJNI.IndexLattice_scale_nbit_get(swigCPtr, this);
  }

  public void setLattice_nbit(int value) {
    swigfaissJNI.IndexLattice_lattice_nbit_set(swigCPtr, this, value);
  }

  public int getLattice_nbit() {
    return swigfaissJNI.IndexLattice_lattice_nbit_get(swigCPtr, this);
  }

  public void setCode_size(long value) {
    swigfaissJNI.IndexLattice_code_size_set(swigCPtr, this, value);
  }

  public long getCode_size() {
    return swigfaissJNI.IndexLattice_code_size_get(swigCPtr, this);
  }

  public void setTrained(FloatVector value) {
    swigfaissJNI.IndexLattice_trained_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getTrained() {
    long cPtr = swigfaissJNI.IndexLattice_trained_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public IndexLattice(long d, int nsq, int scale_nbit, int r2) {
    this(swigfaissJNI.new_IndexLattice(d, nsq, scale_nbit, r2), true);
  }

  public void train(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexLattice_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public long sa_code_size() {
    return swigfaissJNI.IndexLattice_sa_code_size(swigCPtr, this);
  }

  public void sa_encode(long n, SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char bytes) {
    swigfaissJNI.IndexLattice_sa_encode(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(bytes));
  }

  public void sa_decode(long n, SWIGTYPE_p_unsigned_char bytes, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexLattice_sa_decode(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(bytes), SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexLattice_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(long n, SWIGTYPE_p_float x, long k, SWIGTYPE_p_float distances, SWIGTYPE_p_long_long labels) {
    swigfaissJNI.IndexLattice_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long_long.getCPtr(labels));
  }

  public void reset() {
    swigfaissJNI.IndexLattice_reset(swigCPtr, this);
  }

}
