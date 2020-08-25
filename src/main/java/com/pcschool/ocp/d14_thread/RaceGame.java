package com.pcschool.ocp.d14_thread;

public class RaceGame {

    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 舉辦了龜兔賽跑比賽\n", tName);
        Race r1 = new Race("烏龜");
        Race r2 = new Race("兔子");
        r1.setPriority(Thread.MAX_PRIORITY);//1-10
        r2.setPriority(Thread.MIN_PRIORITY);//1-10
        // 餐與人員(有幾條執行緒在運行)
        int coumt = Thread.activeCount();
        r1.start();
        r2.start();
        //餐與人員(有幾條執行緒在運行)
        int count = Thread.activeCount();
        System.out.printf("餐與人員: %d\n", count);
    }
}
