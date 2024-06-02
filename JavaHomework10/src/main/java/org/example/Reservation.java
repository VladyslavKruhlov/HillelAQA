package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Reservation {
    private int roomNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yy");

    public Reservation(int roomNumber, String startDate, String endDate) {
        this.roomNumber = roomNumber;
        this.startDate= LocalDate.parse(startDate, dateTimeFormatter);
        this.endDate = LocalDate.parse(endDate, dateTimeFormatter);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Reservation {" +
                "\nroom №: "+roomNumber+
                "\nfrom: "+startDate+
                "\ntill: "+endDate+
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return roomNumber == that.roomNumber &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, startDate, endDate);
    }
}