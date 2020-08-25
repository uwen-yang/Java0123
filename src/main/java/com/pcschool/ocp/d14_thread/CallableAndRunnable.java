package com.pcschool.ocp.d14_thread;

import java.util.concurrent.Callable;

public class CallableAndRunnable {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("在 Runnable 中得到 Java");
            return;
        };
        Callable c = () -> {
            System.out.println("在 Callable 中得到 Python");
            return "Python";
            
        };
    }
}
