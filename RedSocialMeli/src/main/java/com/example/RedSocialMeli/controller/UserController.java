package com.example.RedSocialMeli.controller;

import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.dto.UserWithFollowersDto;
import com.example.RedSocialMeli.repository.UserRepository;
import com.example.RedSocialMeli.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    // Obtener mensaje desde el controlador
    @GetMapping("/hello")
    public String hello(){
        return "Hello World! ";
    }

    // Obtener lista de todos los usuarios
    @GetMapping("/list")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();

   }
     // Obtener un usuario por id
    @GetMapping("/list/{id}")
    public UserDto getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }


    // Obtener usuario con seguidores
    @GetMapping("/list/followers/{userId}")
    public UserWithFollowersDto getUserWithFollowers(@PathVariable int userId) {
       return  userService.getUserWithFollowers(userId);

    }










}
