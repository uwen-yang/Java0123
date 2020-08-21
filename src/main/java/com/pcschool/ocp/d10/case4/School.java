package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Set;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Jonn");
        s1.addScores(80).addScores(90).addScores(90).addScores(70);
        
        Set<Exam> scores = new LinkedHashSet<>();
        scores.add(new Exam(90));
        scores.add(new Exam(80));
        scores.add(new Exam(70));
        scores.add(new Exam(100));
        Student s2 = new Student("Mary", scores);
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
