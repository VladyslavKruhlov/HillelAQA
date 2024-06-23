package org.example;

import org.example.Exceptions.InvalidDateException;
import org.example.Exceptions.ReservationNotFoundException;
import org.example.Exceptions.RoomAlreadyBookedException;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Hotel() {
        reservations = new ArrayList<>();
    }

    public void bookRoom(Reservation reserveRoom) throws RoomAlreadyBookedException, InvalidDateException {
        if (!isRoomContainsInReservation(reserveRoom)) {
            throw new RoomAlreadyBookedException("This room already reserved");
        } else if (reserveRoom.getStartDate().isAfter(reserveRoom.getEndDate()) ||
                reserveRoom.getStartDate().equals(reserveRoom.getEndDate())) {
            throw new InvalidDateException("You put invalid data or invalid format. Use format 'dd.mm.yy'");
        } else {
            reservations.add(reserveRoom);
            System.out.println("Room " + reserveRoom.getRoomNumber() + " is reserved");
        }
    }

    public void cancelReservation(Reservation reserveRoom) throws ReservationNotFoundException {
        if (!reservations.contains(reserveRoom)) {
            throw new ReservationNotFoundException("This reserve room (" + reserveRoom.getRoomNumber() + ") not found");
        } else {
            reservations.remove(reserveRoom);
            System.out.println("You cancel reservation for room number " + reserveRoom.getRoomNumber());
        }
    }

    public boolean isRoomContainsInReservation(Reservation reserveRoom) throws InvalidDateException {
        for (Reservation room : reservations) {
            if (room.getRoomNumber() == reserveRoom.getRoomNumber() &&
                    !(reserveRoom.getEndDate().isBefore(room.getStartDate()) ||
                            reserveRoom.getStartDate().isAfter(room.getEndDate()))) {
                return false;
            }
        }
        return true;
    }

    public boolean isRoomAvailable(Reservation reserveRoom) throws InvalidDateException {
        if (!isRoomContainsInReservation(reserveRoom)) {
            System.out.println("Room " + reserveRoom.getRoomNumber() + " isn't available.");
            return false;
        } else if (reserveRoom.getStartDate().isAfter(reserveRoom.getEndDate()) ||
                reserveRoom.getStartDate().equals(reserveRoom.getEndDate())) {
            throw new InvalidDateException("You put invalid data or invalid format. Use format 'dd.mm.yy'");
        }
        System.out.println("Room " + reserveRoom.getRoomNumber() + " is available. You can book it.");
        return true;
    }
}