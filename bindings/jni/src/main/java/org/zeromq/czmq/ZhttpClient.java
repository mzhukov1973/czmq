/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import org.scijava.nativelib.NativeLoader;

public class ZhttpClient implements AutoCloseable{
    static {
        if (System.getProperty("java.vm.vendor").contains("Android")) {
            System.loadLibrary("czmqjni");
        } else {
            try {
                NativeLoader.loadLibrary("czmqjni");
            } catch (Exception e) {
                System.exit (-1);
            }
        }
    }
    public long self;
    /*
    Create a new http client
    */
    native static long __new (boolean verbose);
    public ZhttpClient (boolean verbose) {
        /*  TODO: if __new fails, self is null...            */
        self = __new (verbose);
    }
    public ZhttpClient (long pointer) {
        self = pointer;
    }
    /*
    Destroy an http client
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Invoke callback function for received responses.
    Should be call after zpoller wait method.
    Returns 0 if OK, -1 on failure.
    */
    native static int __execute (long self);
    public int execute () {
        return __execute (self);
    }
    /*
    Wait until a response is ready to be consumed.
    Use when you need a synchronize response.

    The timeout should be zero or greater, or -1 to wait indefinitely.

    Returns 0 if a response is ready, -1 and otherwise. errno will be set to EAGAIN if no response is ready.
    */
    native static int __wait (long self, int timeout);
    public int Wait (int timeout) {
        return __wait (self, timeout);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}