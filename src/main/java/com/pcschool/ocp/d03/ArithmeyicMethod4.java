package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;

public class ArithmeyicMethod4 {
    public static void main(String[] args) {
        Exam[] exams = {
             new Exam(100),
             new Exam(50),
             new Exam(80),
             new Exam(90),
             new Exam(90),
        };
        //Java8
        Arrays.stream(exams).forEach(e -> System.out.println(e));
        System.out.println("----------------------------------");
        Arrays.stream(exams)
                .filter(e -> e.getValue() >= 60)//->意思是拿到e要幹嘛
                .sorted(Comparator.comparing(Exam::getScore).reversed())//reversed大到小排序
                .forEach(e -> System.out.println(e));
    }
}

class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }

    int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
