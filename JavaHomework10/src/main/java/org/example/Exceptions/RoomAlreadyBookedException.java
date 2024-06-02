package org.example.Exceptions;

public class RoomAlreadyBookedException extends Exception{
    public RoomAlreadyBookedException(String message){
        super(message);
    }
}