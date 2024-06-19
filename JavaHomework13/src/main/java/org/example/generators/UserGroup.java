package org.example.generators;

import org.example.DTO.UserDTO;
import org.example.entity.User;
import org.example.enums.Gender;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserGroup {
    public void groupByGender(){
        UserGenerator us = new UserGenerator();

        Map<Gender, List<UserDTO>> collect = Stream.generate(us::generator)
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(User::compareTo)
                .filter(user -> user.getEmail() != null)
                .map(user -> new UserDTO(user.getName(), user.getGender()))
                .collect(Collectors.groupingBy(UserDTO::getGender));

        System.out.println(collect);
    }
}