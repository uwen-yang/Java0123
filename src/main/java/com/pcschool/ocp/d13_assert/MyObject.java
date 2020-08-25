package com.pcschool.ocp.d13_assert;

public class MyObject {

    private String s;

    public MyObject() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "����غc�l");

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "���� main ��k"+ Runtime.getRuntime().freeMemory());
    }

    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "���� main ��k, freeMemory" + Runtime.getRuntime().freeMemory());
        MyObject mo = new MyObject();
        mo = null;
        System.gc();
    }
}