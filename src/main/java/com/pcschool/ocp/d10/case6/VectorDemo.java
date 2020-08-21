package com.pcschool.ocp.d10.case6;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>();//capacity 會*2(如果設25會=50)    (25,5)capacity會到30不浪費容積數
        for (int i = 1; i <= 25; i++) {
            v.add(new Random().nextInt(100));
            System.out.printf("capacity: %d size: %02d %s\n", v.capacity(), v.size(), v);
            Thread.sleep(1000);
        }
        
   
    }
    
}
