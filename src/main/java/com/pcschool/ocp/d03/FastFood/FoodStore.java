package com.pcschool.ocp.d03.FastFood;

public class FoodStore {
    public static void main(String[] args) {
        Combine a = new Combine(4, 2, 3, 4);
        Combine b = new Combine(7, 3, 5, 6);
        Combine c = new Combine(1, 1, 1, 1);
        Combine d = new Combine(9, 5, 3, 2);
        System.out.println(a.getPrice());
        System.out.println(b.getPrice());
        System.out.println(c.getPrice());
        System.out.println(d.getPrice());
        System.out.printf("庫存=> 雞腿: %d, 雞胸: %d 可樂: %d\n",
                Leg.getAmount(),Breast.getAmount(),Wings.getAmount(),Coca.getAmount());
    }
}
