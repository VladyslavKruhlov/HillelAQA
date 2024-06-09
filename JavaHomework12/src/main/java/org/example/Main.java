package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, 3.9));
        students.add(new Student("Eve", 20, 3.9));
        students.add(new Student("Bob", 22, 3.9));
        students.add(new Student("Charlie", 20, 3.5));
        students.add(new Student("Dave", 22, 3.5));
        students.add(new Student("Rick", 19, 4.1));
        students.add(new Student("Dave", 25, 4.1));
        students.add(new Student("Simon", 25, 4.1));

        Collections.sort(students);
        System.out.println(students);
    }
}