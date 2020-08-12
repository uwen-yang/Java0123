package com.pcschool.ocp.game.case2;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        //int[] ans = {3, 8, 4, 5};
        int[] ans = Util.getRandomIntArray(4);
        int[] user = {0, 0, 0, 0};
        
        
        //資料填入 user 陣列
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入一不四重複數字: ");
            String userAns = sc.next();
        for (int i = 0; i < user.length; i++) {
            user[i] = Integer.parseInt(userAns.charAt(i) + "");
        }
        //列出 user 陣列資料
        for (int x : user) {
            System.out.print(x + " ");
        }
        System.out.println();
        int a = 0;
        int b = 0;
        for (int ur : user) {
            for (int as : ans) {
                if (ur == as) {
                    b++;
                }
            }
        }
        for (int i = 0; i < user.length; i++) {
            if (user[i] == ans[i]) {
                a++;
            }
        }
        b = b - a;
        System.out.printf("%dA%dB\n", a, b);
        if (a == 4) {
            System.out.println("Bingo ~~~");
            break;
        }
    }
}
}
