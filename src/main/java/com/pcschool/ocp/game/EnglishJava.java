package com.pcschool.ocp.game;

import java.util.Scanner;

public class EnglishJava {

    public static void main(String[] args) {
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
                System.out.printf("結果: %s 了\n", result > 0 ? "大" : "小");
            }

        }

    }

}
