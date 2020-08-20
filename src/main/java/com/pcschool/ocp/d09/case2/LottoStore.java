package com.pcschool.ocp.d09.case2;

import java.util.Random;

public class LottoStore {

    public static void main(String[] args) {
        //實作 Lotto 介面以開出 0-9 一個數字
        class NumberOne {
            public void printNumber(){
                Random r = new Random();
                System.out.printf("%d\n", r.nextInt(10));
            }
        }

        //實作 Looto 介面以開出 0-9 四個數字
        class NumberFour {
             public void printNumber(){
                Random r = new Random();
                System.out.printf("%d %d %d %d\n", r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10));
            }
        }
    }
}