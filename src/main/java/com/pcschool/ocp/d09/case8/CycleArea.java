package com.pcschool.ocp.d09.case8;

import java.util.Arrays;

public class CycleArea {
    public static void main(String[] args) {
        int[] rs = {5, 10, 15, -4, 20, 0, -25};
        Arrays.stream(rs)
                .filter((r) -> r > 0)//Predicate 得到 5, 10, 15, 20
                .mapToDouble((r) -> r * r * Math.PI)//Function
                .forEach(area -> System.out.println(area));//Consimer
                
    }
}
