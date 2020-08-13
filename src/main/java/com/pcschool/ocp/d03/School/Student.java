package com.pcschool.ocp.d03.School;

public class Student {
    private String name;
    private int age;
    private BMI bmi;

    public Student(String name, int age, BMI bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }

    Student(String name, int age, BMI bmi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", bmi=" + bmi + '}';
    }
    
    
    
}
