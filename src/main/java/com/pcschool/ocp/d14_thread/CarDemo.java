package com.pcschool.ocp.d14_thread;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class CarDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("吃午飯");
        CyclicBarrier cb = new CyclicBarrier(4);
        IntStream.rangeClosed(0, 3).forEach(i -> {
            System.out.printf("第 %d 臺車預備\n", i);
            new Car(cb).start();
        });
    }
}
