package com.pcschool.ocp.game;

import java.util.Scanner;

public class JavaGame {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("Java Game");
            System.out.println("--------------");
            System.out.println("1.猜數字");
            System.out.println("2.猜英文");
            System.out.println("9.Exit");
            System.out.println("--------------");
            System.out.println("請選擇 ==> ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    numberGameLoop();
                    break;
                case 2:
                    englishGameLoop();
                    break;
                case 9:
                    return;
            }
            System.out.println("請按下 Enter 鍵繼續 ...");
            new Scanner(System.in).nextLine();
            
        }

    }

    public static void englishGameLoop() {
        Number number = new Number();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入數字: ");
            int userAnt = sc.nextInt();
            int result = number.check(userAnt);
            if (result == 0) {
                System.out.println("恭喜答對了~");
            } else {
                System.out.printf("猜第 %d 次, 結果: %s 了\n", number.getCount(), result > 0 ? "大" : "小");
            }
        }
    }

    public static void numberGameLoop() {
        English english = new English();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入英文字母: ");
            int userAns = sc.next().toUpperCase().charAt(0);
            int result = english.check(userAns);
            if (result == 0) {
                System.out.println("恭喜答對了~");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: %s 了\n", english.getCount(), result > 0 ? "大" : "小");
            }

        }

    }

}
