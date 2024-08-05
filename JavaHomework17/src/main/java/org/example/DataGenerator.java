package org.example;

import java.util.Random;

public class DataGenerator {
    public String mailGenerator(){
        Random random = new Random();
        String mailName = "Autotest";
        String mailTale = "@mailinator.com";
        String generatedMail = "";

        for (int i = 0; i < 5; i++) {
            int randomNumber = 1000 + random.nextInt(9999);
            generatedMail = mailName+randomNumber+mailTale;
        }
        return generatedMail;
    }

    public String phoneGenerator(){
        Random random = new Random();
        String generatedPhoneNumber = "";

        for (int i = 0; i < 10; i++) {
            int randomNumber = 100000000 + random.nextInt(900000000);
            generatedPhoneNumber = ""+randomNumber;
        }
        return generatedPhoneNumber;
    }
}