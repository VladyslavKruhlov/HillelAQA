package org.example;

import java.util.Scanner;

public class TicketMachine {
    Scanner scanner = new Scanner(System.in);
    public TransportType chooseTransport() {
        System.out.println("Please enter a letter for choosing transport: 'b' for Bus, 't' for Train, 'm' for Metro or enter letter 'n' for close program");
        String input = scanner.nextLine();
        TransportType transportType = null;

        switch (input){
            case "b":
                transportType = TransportType.BUS;
                System.out.println("You choose Bus\n");
                break;

            case "m":
                transportType = TransportType.METRO;
                System.out.println("You choose Metro\n");
            break;

            case "t":
                transportType = TransportType.TRAIN;
                System.out.println("You choose Train\n");
            break;

            case "n":
                System.out.println("Good bye");
                System.exit(0);
                break;

            default:
                System.out.println("Put the correct letter for choosing transport");
        }
        return transportType;
    }

    public Integer chooseZone(){
        System.out.println("Please enter a number for choosing transport zone: 1, 2, 3 or enter letter '0' for close program");
        Integer transportZone = 0;

        while (transportZone==0) {
            if (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    transportZone = 1;
                    System.out.println("You choose zone #1\n");
                    break;

                case 2:
                    transportZone = 2;
                    System.out.println("You choose zone #2\n");
                    break;

                case 3:
                    transportZone = 3;
                    System.out.println("You choose zone #3\n");
                    break;

                case 0:
                    System.out.println("Good bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Put the correct number for choosing transport zone");
            }
        }
            else {
                System.out.println("Invalid input. Please try numbers 1, 2, 3");
                scanner.nextLine();
            }
        }
        return transportZone;
    }

    public void calculateFare() {
        TransportType transportType = chooseTransport();
        if (transportType == null) {
            return;
        }
        Integer zone = chooseZone();
        if (zone == null) {
            return;
        }
        String price = transportType.getEnumValue().get(zone);
        System.out.println("Your ticket is:\n" + "Transport: "+transportType+"\nTransport zone: "+zone+"\nPrice: "+price);
    }
}