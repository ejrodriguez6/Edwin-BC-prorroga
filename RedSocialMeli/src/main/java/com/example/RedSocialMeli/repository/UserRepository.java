package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.UserDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository
{

  //  @PostConstruct
    public List<UserDto> initUsers() {
        List<UserDto> userList = new ArrayList<>();

        // Agregar algunos usuarios a la lista
        userList.add(new UserDto(1, "Edwin"));
        userList.add(new UserDto(2, "Maria"));
        userList.add(new UserDto(3, "Cesar"));

        return userList;
    }


}