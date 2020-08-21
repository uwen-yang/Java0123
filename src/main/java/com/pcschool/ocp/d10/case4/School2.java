package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.ToIntFunction;


public class School2 {
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
        
        //全班成績
        Set<Student> students = new LinkedHashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students);
        
        //全班 2 (平均大的放在前面, 小的放在後面)
        Set<Student>students2 = new TreeSet<>();
        students2.add(s1);
        students2.add(s2);
        System.out.println(students2);
        
        
               
        
        
        //以每人的最高分來求平均?
        double avg = students.stream()
                             .mapToInt(s -> s.getExams().stream()                                      //[80, 90, 70]Integer[]
                                             .mapToInt(e -> e.getScore()).summaryStatistics().getMax())//[80, 90, 70] int[]
                                             .average()                                                //統計運算
                                             .getAsDouble();                                           //90
        System.out.println(avg);
        
        //在 Exam 中取出最高分的方法
       
    }

   
}
