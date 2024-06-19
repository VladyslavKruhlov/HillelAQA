package org.example;

import org.example.entity.User;
import org.example.generators.UserGenerator;
import org.example.generators.UserGroup;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        UserGroup userGroup = new UserGroup();
        System.out.println("All users:");
        userGroup.groupByGender();

        System.out.println("\n********\n");

        UserGenerator us = new UserGenerator();
        List<User> collect = Stream.generate(us::generator)
                .limit(20)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}