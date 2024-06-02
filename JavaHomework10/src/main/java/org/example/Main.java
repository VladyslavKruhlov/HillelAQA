package org.example;

import org.example.Exceptions.InvalidDateException;
import org.example.Exceptions.ReservationNotFoundException;
import org.example.Exceptions.RoomAlreadyBookedException;

public class Main {
    public static void main(String[] args) throws RoomAlreadyBookedException, ReservationNotFoundException, InvalidDateException {

        Hotel hotel = new Hotel();

        // Correct reservation
        Reservation reservedRoom1 = new Reservation(200, "01.02.24", "01.03.24");
        Reservation reservedRoom2 = new Reservation(201, "01.02.24", "20.02.24");
        Reservation reservedRoom3 = new Reservation(200, "01.04.24", "01.05.24");

        // Intersect and wrong date
        Reservation wrongDate = new Reservation(200, "30.05.24", "02.05.24");
        Reservation intersectWithRoom2 = new Reservation(201, "01.02.24", "25.02.24");

        // Positive scenarios (add, cancel, search)

//        System.out.println("\nCorrect reservation\n");
//        hotel.bookRoom(reservedRoom2);
//        hotel.bookRoom(reservedRoom1);
//        System.out.println("\nCorrect cancel\n");
//        hotel.cancelReservation(reservedRoom2);
//        System.out.println("\nCorrect search\n");
//        hotel.isRoomAvailable(reservedRoom2);

        // Negative scenarios (add clones, cancel not reserved room, find already reserved room, add room with wrong date, find room with wrong date)

//        System.out.println("\nIncorrect reservation\n");
//        hotel.bookRoom(intersectWithRoom2);
//        hotel.bookRoom(reservedRoom2);
//        hotel.bookRoom(wrongDate);
//        System.out.println("\nIncorrect canceling reservation\n");
//        hotel.cancelReservation(reservedRoom1);
//        System.out.println("\nIncorrect date\n");
//        hotel.isRoomAvailable(wrongDate);
//        System.out.println("\nRoom isn`t available\n");
//        hotel.isRoomAvailable(reservedRoom2);
    }
}