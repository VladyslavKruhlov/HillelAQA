package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            double first;
            double second;
            String sign;

            while (true) {
                System.out.println("Enter the first number: ");
                if (in.hasNextDouble()) {
                    first = in.nextDouble();
                    break;
                } else {
                    System.out.println("You input isn't a number! Please enter a number: ");
                    in.next();
                }
            }

            while (true) {
                System.out.println("Enter the second number: ");
                if (in.hasNextDouble()) {
                    second = in.nextDouble();
                    break;
                } else {
                    System.out.println("You input isn't a number! Please enter a number: ");
                    in.next();
                }
            }

            while (true) {
                System.out.println("Enter the sign: ");
                sign = in.next();
                if (sign.length() == 1 && "+-*/%".contains(sign)) {
                    break;
                } else {
                    System.out.println("You input isn't a valid sign! Please enter a sign: ");
                }
            }

            Calculator calculator = new Calculator();
            System.out.println(calculator.action(first, second, sign));

            System.out.println("\nContinue ?\nIf you want continue press any key, or press 'n' for end");
            String switcher = in.next();

            if(switcher.equals("n")){
                in.close();
                condition = false;
                System.out.println("End of working");
            }
        }
    }
}