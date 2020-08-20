package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoOne {
    public void printNumber() {
        Random r = new Random();
        System.out.printf("%d\n", r.nextInt(10));
    }
}
