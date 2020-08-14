package com.pcschool.ocp.exam;

public class Test3 {
    StringBuilder s;//StringBuilder 可變
    public Test3(StringBuilder s) {
        this.s = s.append("8");
    }
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("Java");
        Test3 t2 = new Test3(s);
        System.out.println(s);
        System.out.println(t2.s);
    }
}
//static 裡不能出現 this & super
//this & super不會同時出現