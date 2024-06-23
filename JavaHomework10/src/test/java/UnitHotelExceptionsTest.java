import org.example.Exceptions.InvalidDateException;
import org.example.Exceptions.ReservationNotFoundException;
import org.example.Exceptions.RoomAlreadyBookedException;
import org.example.Hotel;
import org.example.Reservation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class UnitHotelExceptionsTest {
    private Hotel hotel;
    private Reservation reservedRoom;
    private Reservation reservedRoomWithWrongDate;
    private Reservation reservedRoomWithIntersectDate;

    @BeforeClass
    public void initHotelAndRooms(){
        hotel = new Hotel();
        reservedRoom = new Reservation(200, "01.02.24", "01.03.24");
        reservedRoomWithWrongDate = new Reservation(200, "30.05.24", "02.05.24");
        reservedRoomWithIntersectDate = new Reservation(200, "30.02.24", "03.03.24");
    }

    @Test(expectedExceptions = RoomAlreadyBookedException.class, groups = "Exception", description = "Перевіряє, що виключення RoomAlreadyBookedException кидається при спробі бронювання вже заброньованого номера")
    public void testBookRoomAlreadyBooked() throws RoomAlreadyBookedException, InvalidDateException {
        hotel.bookRoom(reservedRoom);
        assertTrue(hotel.getReservations().contains(reservedRoom));
        hotel.bookRoom(reservedRoom);
    }

    @Test(expectedExceptions = InvalidDateException.class, groups = "Exception", description = "Перевіряє, що виключення InvalidDateException кидається при спробі бронювання з некоректною датою")
    public void testBookRoomInvalidDate() throws RoomAlreadyBookedException, InvalidDateException {
        hotel.bookRoom(reservedRoomWithWrongDate);
    }

    @Test(expectedExceptions = ReservationNotFoundException.class, groups = "Exception", description = "Перевіряє, що виключення ReservationNotFoundException кидається при спробі скасування неіснуючого бронювання")
    public void testCancelReservationNotFound() throws ReservationNotFoundException {
        hotel.cancelReservation(reservedRoomWithIntersectDate);
    }

    @Test(groups = "Exception", description = "Перевіряє, що виключення InvalidDateException кидається при перевірці доступності з некоректною датою")
    public void testIsRoomAvailableInvalidDate() {
        try {
            hotel.isRoomAvailable(reservedRoomWithWrongDate);
            fail("Expected InvalidDateException to be thrown");
        } catch (InvalidDateException e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void hotelCleaner(){
        hotel.getReservations().clear();
    }
}