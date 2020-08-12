package com.pcschool.ocp.d02;

public class MulitArray2 {

    public static void main(String[] args) {
        int[][] x = new int[][]{{100, 90, 80}, {70, 60, 50}, {30, 20}};//可不打new int[][]
        System.out.println("x length = " + x.length);
        for (int k = 0; k < x.length; k++) {
            for (int i = 0; i < x[k].length; i++) {
                System.out.println(x[k][i]);
            }
        }
    }
}
