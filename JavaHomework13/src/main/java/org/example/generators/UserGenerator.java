package org.example.generators;

import org.example.entity.User;
import org.example.enums.Gender;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {


    public static final String [] NAME = {"Oleh", "Vlad", "Vova", "Sasha", "Eli", "Nina", "Ira", "Diana", "Max", "Yura", "Slavic", "Anya", "Olha"};
    private static final Random RANDOM = new Random();
    private static final EmailGenerator EMAIL_GENERATOR = new EmailGenerator();
    private static final Gender[] GENDERS = Gender.values();
    private static final List<String> EMAILS = new ArrayList<>();

    static {
        EMAILS.add(EMAIL_GENERATOR.emailGenerator());
        EMAILS.add(EMAIL_GENERATOR.emailNullGenerator());
    }

    public User generator(){
        String name = NAME[RANDOM.nextInt(NAME.length)];
        int age = RANDOM.nextInt(50);
        String email = EMAILS.get(RANDOM.nextInt(EMAILS.size()));
        Gender gender = GENDERS[RANDOM.nextInt(GENDERS.length)];

        return new User(name, age, email, gender);
    }
}