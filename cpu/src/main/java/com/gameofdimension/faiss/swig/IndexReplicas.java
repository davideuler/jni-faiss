/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class IndexReplicas extends ThreadedIndexBase {
  private transient long swigCPtr;

  protected IndexReplicas(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexReplicas_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexReplicas obj) {
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
        swigfaissJNI.delete_IndexReplicas(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IndexReplicas(boolean threaded) {
    this(swigfaissJNI.new_IndexReplicas__SWIG_0(threaded), true);
  }

  public IndexReplicas() {
    this(swigfaissJNI.new_IndexReplicas__SWIG_1(), true);
  }

  public IndexReplicas(int d, boolean threaded) {
    this(swigfaissJNI.new_IndexReplicas__SWIG_2(d, threaded), true);
  }

  public IndexReplicas(long d) {
    this(swigfaissJNI.new_IndexReplicas__SWIG_3(d), true);
  }

  // public IndexReplicas(int d, boolean threaded) {
  //   this(swigfaissJNI.new_IndexReplicas__SWIG_4(d, threaded), true);
  // }

  public IndexReplicas(int d) {
    this(swigfaissJNI.new_IndexReplicas__SWIG_5(d), true);
  }

  public void add_replica(Index index) {
    swigfaissJNI.IndexReplicas_add_replica(swigCPtr, this, Index.getCPtr(index), index);
  }

  public void remove_replica(Index index) {
    swigfaissJNI.IndexReplicas_remove_replica(swigCPtr, this, Index.getCPtr(index), index);
  }

  public void train(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexReplicas_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexReplicas_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(long n, SWIGTYPE_p_float x, long k, SWIGTYPE_p_float distances, SWIGTYPE_p_long_long labels) {
    swigfaissJNI.IndexReplicas_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long_long.getCPtr(labels));
  }

  public void reconstruct(long arg0, SWIGTYPE_p_float v) {
    swigfaissJNI.IndexReplicas_reconstruct(swigCPtr, this, arg0, SWIGTYPE_p_float.getCPtr(v));
  }

}
