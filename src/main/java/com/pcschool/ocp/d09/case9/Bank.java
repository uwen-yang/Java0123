package com.pcschool.ocp.d09.case9;

public class Bank {
    public static void main(String[] args) {
        //我要 PENNY=1, NICKLE=5, DIME=10, QUARTER=25
        
        //我要一個 PENNY
        USCurrency us = USCurrency.PENNY;
        System.out.println(us.getValue());
        
    }
}
