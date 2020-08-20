package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoFour {
    public void printNumber() {
        Random r = new Random();
        System.out.printf("%d %d %d %d\n", r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10));
    }
}
