package com.pcschool.ocp.d03.School;

public class School {

    public static void main(String[] args) {
        String[][] data = {
            {"John", "18", "170", "60"},
            {"Mary", "17", "160", "45"},
            {"Jane", "18", "170", "65"},
            {"Mark", "19", "180", "55"},};

        Student[] students = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            String[] row = data[i];
            String name = row[0];
            int age = Integer.parseInt(row[1]);
            double heigth = Double.parseDouble(row[2]);
            double weigth = Double.parseDouble(row[3]);
            //建立BMI物件
            BMI bmi = new BMI(heigth, weigth);
            //建立Student物件
            Student student = new Student(name, age, bmi);
            //置入資料
            students[i] = student;
        }
        //列印 students
        for (Student student : students) {
            System.out.println(student);
        }
        for (int i = 0; i < students.length; i++) {
            Student s1 = students[i];
            Student s2 = students[i + 1];

        }
    }
}