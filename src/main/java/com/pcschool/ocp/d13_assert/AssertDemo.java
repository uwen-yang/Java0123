package com.pcschool.ocp.d13_assert;

public class AssertDemo {
    public static void main(String[] args) {
        int x = 30;
        int y = 20;
        //我期望x>y
        assert(x > y):String.format("x(%d)沒有大於y(%d)", x, y);
        System.out.println(x + y);
    }
}
