package com.pcschool.ocp.d04;

public class ConstrutorDemo2 {

    public static void main(String[] args) {
        Pen p1 = new Pen(10);
        System.out.println(p1);
        Pen p2 = new Pen();
        System.out.println(p2);
        Pen p3 = new Pen(2);
        System.out.println(p3);
    }
}
