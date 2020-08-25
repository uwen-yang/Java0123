package com.pcschool.ocp.d13_assert;

public class Square {

    //梯形面積
    public int getArea(int x, int y, int h) {
        int area = h * (x + y) / 2;
        return area;
    }
    //三角形面積

    public int getArea2(int a, int b) {
        int area = (a * b) / 2;
        return area;

    }
}
