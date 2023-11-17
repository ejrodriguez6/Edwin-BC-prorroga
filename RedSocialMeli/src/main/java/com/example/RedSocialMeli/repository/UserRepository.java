package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository
{


    private final List<UserDto> userList = new ArrayList<>();

    @PostConstruct
    public List<UserDto> initUsers() {
        userList.add(new UserDto(1, "Edwin"));
        userList.add(new UserDto(2, "Maria"));
        userList.add(new UserDto(3, "Cesar"));
        userList.add(new UserDto(4,"Victoria"));
        userList.add(new UserDto(5,"Jose"));
        userList.add(new UserDto(6,"Mariana"));

        return userList;
    }



    public UserDto getUserById(int userId) {
        return userList.stream()
                .filter(user -> user.getUserId() == userId)
                .findFirst()
                .orElse(null);
    }


}