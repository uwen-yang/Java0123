package com.pcschool.ocp.d03.School;

public class BMI {
    private double heigh;
    private double weigh;
    private double bmiValue;

    public BMI(double heigh, double weigh) {
        this.heigh = heigh;
        this.weigh = weigh;
        this.bmiValue = weigh / Math.pow(heigh/100, 2);
    }

    @Override
    public String toString() {
        return "BMI{" + "heigh=" + heigh + ", weigh=" + weigh + ", bmiValue=" + bmiValue + '}';
    }
    
    
}
