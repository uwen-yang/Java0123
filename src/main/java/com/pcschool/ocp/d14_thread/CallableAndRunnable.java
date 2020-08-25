package com.pcschool.ocp.d14_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAndRunnable {

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("在 Runnable 中得到 Java");
            return;//無回傳值
        };
        Callable c = () -> {
            System.out.println("在 Callable 中得到 Python");
            return "Python";//有回傳值
        };
        ExecutorService service = Executors.newCachedThreadPool();
        
    }
}
