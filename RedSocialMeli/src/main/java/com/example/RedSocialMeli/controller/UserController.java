package com.example.RedSocialMeli.controller;

import com.example.RedSocialMeli.dto.*;
import com.example.RedSocialMeli.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //US 0001: Poder realizar la acción de “Follow” (seguir) a un determinado vendedor
    @PostMapping("/{userId}/follow/{userIdToFollow}")
    public List<FollowedDto> addFollowedUser(@PathVariable Integer userId, @PathVariable Integer userIdToFollow) {
      return  userService.addFollowedUser(userId, userIdToFollow);

    }



    // US 0002: Obtener el resultado de la cantidad de usuarios que siguen a un determinado vendedor
    @GetMapping("/{userId}/followers/count")
    public FollowersCountDto getFollowersCount(@PathVariable int userId){
        return userService.getFollowersCount(userId);
    }

    // US 0003: Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)
    @GetMapping("/{userId}/followers/list")
    public FollowersListDto getFollowersList(@PathVariable int userId, @RequestParam @Nullable NameOrderEnumDto order) {
        return userService.getFollowersList(userId, order);
    }

    //US 0004: Obtener un listado de todos los vendedores a los cuales sigue un determinado usuario (¿A quién sigo?)
    @GetMapping("/{userId}/followed/list")
    public FollowedListDto getFollowedList(@PathVariable int userId, @RequestParam @Nullable NameOrderEnumDto order){
        return userService.getFollowedList(userId, order);
    }




}
