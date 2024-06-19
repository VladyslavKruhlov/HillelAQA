package org.example.entity;

import org.example.enums.Gender;

public class User {
    private String name;
    private int age;
    private String email;
    private Gender gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public User(String name, int age, String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender;
    }

    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}