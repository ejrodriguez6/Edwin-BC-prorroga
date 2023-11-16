package com.example.RedSocialMeli.controller;

import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.repository.UserRepository;
import com.example.RedSocialMeli.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;

  // Obtener lista de usuarios
    @GetMapping("/list")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();

   }



//Obtener mensaje desde el controlador
   @GetMapping("/hi")
    public String obtenerSaludo(){
        return "Hola desde el controlador!";
    }



}
