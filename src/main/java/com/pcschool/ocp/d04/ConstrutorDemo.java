package com.pcschool.ocp.d04;

public class ConstrutorDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("ya", 40000);
        System.out.println(emp);
        Employee emp2 = new Employee();
        System.out.println(emp2);
    }
}
