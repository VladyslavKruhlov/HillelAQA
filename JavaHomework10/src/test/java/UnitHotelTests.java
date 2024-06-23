import org.example.Exceptions.InvalidDateException;
import org.example.Exceptions.ReservationNotFoundException;
import org.example.Exceptions.RoomAlreadyBookedException;
import org.example.Hotel;
import org.example.Reservation;
import org.testng.annotations.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static  org.testng.Assert.*;

public class UnitHotelTests {
    private Hotel hotel;
    private Reservation reservedRoom;
    private Reservation reservedRoom2NewData;
    private ByteArrayOutputStream outMessage;

    @BeforeClass
    public void initHotelAndRooms(){
        hotel = new Hotel();
        reservedRoom = new Reservation(200, "01.02.24", "01.03.24");
        reservedRoom2NewData = new Reservation(200, "04.03.24", "20.03.24");
    }

    @BeforeMethod
    public void initStreamReader(){
        outMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outMessage));
    }

    @Test(groups = "PositiveHotelTest", description = "Перевіряє успішне бронювання номера")
    public void testBookRoomSuccessfully() throws InvalidDateException, RoomAlreadyBookedException {
        hotel.bookRoom(reservedRoom);

        String expectedResult = "Room " + reservedRoom.getRoomNumber() + " is reserved";

        assertEquals(outMessage.toString().trim(), expectedResult);
        assertTrue(hotel.getReservations().contains(reservedRoom));
        assertFalse(hotel.isRoomAvailable(reservedRoom));
    }

    @Test(groups = "PositiveHotelTest", description = "Перевіряє успішне скасування бронювання")
    public void testCancelReservationSuccessfully() throws ReservationNotFoundException, RoomAlreadyBookedException, InvalidDateException {
        hotel.bookRoom(reservedRoom);

        outMessage.reset();

        hotel.cancelReservation(reservedRoom);

        String expectedResult = "You cancel reservation for room number " + reservedRoom.getRoomNumber();

        assertEquals(outMessage.toString().trim(), expectedResult);
        assertFalse(hotel.getReservations().contains(reservedRoom));
        assertTrue(hotel.isRoomAvailable(reservedRoom));
    }

    @Test(groups = "PositiveHotelTest", description = "Перевіряє доступність номера на різні дати")
    public void testIsRoomAvailable() throws RoomAlreadyBookedException, InvalidDateException {
        hotel.bookRoom(reservedRoom);

        outMessage.reset();

        hotel.isRoomAvailable(reservedRoom2NewData);

        String expectedResult = "Room " + reservedRoom2NewData.getRoomNumber() + " is available. You can book it.";

        assertEquals(outMessage.toString().trim(), expectedResult);
        assertFalse(hotel.getReservations().contains(reservedRoom2NewData));
        assertTrue(hotel.isRoomAvailable(reservedRoom2NewData));
    }

    @AfterMethod
    public void hotelCleaner(){
        hotel.getReservations().clear();
    }
}