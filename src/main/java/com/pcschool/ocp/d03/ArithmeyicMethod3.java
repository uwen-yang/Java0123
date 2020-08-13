package com.pcschool.ocp.d03;

import java.util.Arrays;


class BMI{
    private double h;
    private double w;
    private double value;
    
    public BMI(double h, double w){
        this.h = h;
        this.w = w;
        value = w / Math.pow(h/100, 2);
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", value=" + value + '}';
    }
    
}


public class ArithmeyicMethod3 {
    public static void main(String[] args) {
        double[][] bmis = {{170.0, 60.0},{160.0,65.0},{185.0, 65.5}};
        //Java 8
        Arrays.stream(bmis).forEach(b -> System.out.println(b));
        
        
        
    }
}
