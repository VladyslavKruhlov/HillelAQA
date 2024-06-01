package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TicketMachine ticketMachine = new TicketMachine();
        boolean condition = true;

        while (condition){
            ticketMachine.calculateFare();
            System.out.println("\nRestart program ?\nEnter any letter for restart or 'n' for finish");
            String input = scanner.nextLine();
            if(input.equals("n")){
                condition = false;
                System.out.println("Good bye");
            }
        }
        scanner.close();
    }
}