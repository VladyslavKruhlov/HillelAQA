package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your words separate with (space or ',' , ':' , ';')");
        String words = scanner.nextLine();
        System.out.println("Unique words: ");
        method.getUniqueWords(words);
        scanner.close();
    }
}