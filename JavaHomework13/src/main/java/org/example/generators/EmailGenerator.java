package org.example.generators;

import java.util.Random;

public class EmailGenerator {
    public String emailGenerator(){
        Random random = new Random();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int emailLength = random.nextInt(7)+3;
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<emailLength; i++){
            char randomChar = abc.charAt(random.nextInt(abc.length()));
            sb.append(randomChar);
        }

        return sb+"@gmail.com";
    }

    public String emailNullGenerator(){
        return null;
    }
}