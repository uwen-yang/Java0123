package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student>{
    private String name;
    private Set<Exam> exams;

    public Student(String name) {//建構式
        this(name, new LinkedHashSet());//建立一個空的集合
    }

    public Student(String name, Set<Exam> scores) {
        this.name = name;
        this.exams = exams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public Student addScores(int score) {
        Exam exam = new Exam(score);
        exams.add(exam);
        return this;
    }

    @Override
    public String toString() {//封裝
        return "Student{" + "name=" + name + ", scores=" + exams + '}';
    } 

    public int comparTo(Student other) {
        double avg = this.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        double avg_other = other.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        return(int)(avg_other);
    }

    @Override
    public int compareTo(Student o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
