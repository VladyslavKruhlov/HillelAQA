package org.example;

public class Student implements Comparable<Student>{

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (Age=" + age + ", Grade=" + grade + ")";
    }

    @Override
    public int compareTo(Student o) {
        int gradeVariant = Double.compare(o.grade, this.grade);
        if (gradeVariant!=0){
            return gradeVariant;
        }

        int ageVariant = Integer.compare(this.age, o.age);
        if (ageVariant!=0){
            return ageVariant;
        }

        return this.name.compareTo(o.name);
    }
}
