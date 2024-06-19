package org.example.DTO;

import org.example.enums.Gender;

public class UserDTO {
    private String name;
    private Gender gender;

    public UserDTO(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name;
    }
}