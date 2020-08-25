package com.pcschool.ocp.d14_thread;

public class WalkGame {

    public static void main(String[] args) {
        Runnable r1 = new Walk();
        Runnable r2 = new Walk();
        Runnable r3 = new Walk();
        Runnable r4 = new Walk();
        Thread t1 = new Thread(r1, "烏龜");
        Thread t2 = new Thread(r2, "兔子");
    }
}
