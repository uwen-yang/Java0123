package com.pcschool.ocp.d02;

public class MultiArray5 {
    public static void main(String[] args) {
        char[][] ttt = {
                          {'O','O','X'},
                          {'X','O',' '},
                          {'X',' ','X'}
                        };
        ttt[2][1] ='O';
        System.out.println("O 是勝利");
        //印出最後結局
        for(int i=0;i<ttt.length;i++) {
            System.out.println(ttt[i]);
        }
    }
}
