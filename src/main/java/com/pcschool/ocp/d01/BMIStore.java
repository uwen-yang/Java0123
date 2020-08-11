package com.pcschool.ocp.d01;

public class BMIStore {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name = "John";b1.h = 170;b1.w = 56
        ;b1.calcBMI();
        BMI b2 = new BMI();
        b2.name = "John";b2.h = 183;b2.w = 75;
        b2.calcBMI();
         
        System.out.printf("%s bmi=%.2f\n", b1.name, b1.bmi);
        System.out.printf("%s bmi=%.2f\n", b2.name, b2.bmi);
    }
}
