package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountOccurrence countOccurrence = new CountOccurrence();
        CalcOccurrence calcOccurrence = new CalcOccurrence();
        FindOccurrence findOccurrence = new FindOccurrence();
        FindOccurrence2 findOccurrence2 = new FindOccurrence2();

        String word = "Max";
        List<String> list = new ArrayList<>();

        list.add("Nina");
        list.add("Nick");
        list.add("John");
        list.add("Silva");
        list.add("Max");
        list.add("Max");
        list.add("Ben");
        list.add("Ben");
        list.add("John");

        String resultForCountOccurrence = countOccurrence.countOccurrence(list, word);
//
        System.out.println(resultForCountOccurrence);
//        calcOccurrence.calcOccurrence(list);
        findOccurrence.findOccurrence(list);
//        findOccurrence2.findOccurrence(list);
    }
}