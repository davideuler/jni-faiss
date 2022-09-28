package com.gameofdimension.faiss.utils;

import com.google.common.base.Preconditions;

import java.io.IOException;

/**
 * @author yzq, yzq@leyantech.com
 * @date 2020-01-28.
 */
public class JniFaissInitializer {

  private static volatile boolean initialized = false;

  static {
    try {
      String os = System.getProperty("os.name"); // Linux, Mac OS X

      String osArch = System.getProperty("os.arch"); // aarch64 for mac m1

      if("Linux".equalsIgnoreCase(os)){
        NativeUtils.loadLibraryFromJar("/_swigfaiss.so");
      } else if("aarch64".equalsIgnoreCase(osArch)){ //mac m1
        NativeUtils.loadLibraryFromJar("/_swigfaiss_mac_arm64.so");
      } else { // mac intel
        NativeUtils.loadLibraryFromJar("/_swigfaiss_mac.so");
      }
      
      initialized = true;
    } catch (IOException e) {
      System.err.println("Error loading _swigfaiss library");
      e.printStackTrace();
      Preconditions.checkArgument(false);
    }
  }

  public static boolean initialized() {
    return initialized;
  }
}
