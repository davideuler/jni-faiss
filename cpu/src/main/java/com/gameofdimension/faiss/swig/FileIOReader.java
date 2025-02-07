/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class FileIOReader extends IOReader {
  private transient long swigCPtr;

  protected FileIOReader(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.FileIOReader_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileIOReader obj) {
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
        swigfaissJNI.delete_FileIOReader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setF(SWIGTYPE_p_FILE value) {
    swigfaissJNI.FileIOReader_f_set(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(value));
  }

  public SWIGTYPE_p_FILE getF() {
    long cPtr = swigfaissJNI.FileIOReader_f_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public void setNeed_close(boolean value) {
    swigfaissJNI.FileIOReader_need_close_set(swigCPtr, this, value);
  }

  public boolean getNeed_close() {
    return swigfaissJNI.FileIOReader_need_close_get(swigCPtr, this);
  }

  public FileIOReader(SWIGTYPE_p_FILE rf) {
    this(swigfaissJNI.new_FileIOReader__SWIG_0(SWIGTYPE_p_FILE.getCPtr(rf)), true);
  }

  public FileIOReader(String fname) {
    this(swigfaissJNI.new_FileIOReader__SWIG_1(fname), true);
  }

  public int fileno() {
    return swigfaissJNI.FileIOReader_fileno(swigCPtr, this);
  }

}
