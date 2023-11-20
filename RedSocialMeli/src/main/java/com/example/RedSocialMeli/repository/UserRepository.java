package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.dto.UserTypeEnumDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository
{


    private  List<UserDto> userList = new ArrayList<>();


    //@PostConstruct
    public List<UserDto> initUsers() {
        userList.add(new UserDto(1, "Edwin", UserTypeEnumDto.COMPRADOR));
        userList.add(new UserDto(2, "Maria", UserTypeEnumDto.COMPRADOR));
        userList.add(new UserDto(3, "Cesar", UserTypeEnumDto.COMPRADOR));
        userList.add(new UserDto(4,"Victoria", UserTypeEnumDto.VENDEDOR));
        userList.add(new UserDto(5,"Jose", UserTypeEnumDto.VENDEDOR));
        userList.add(new UserDto(6,"Mariana", UserTypeEnumDto.VENDEDOR));

        return userList;
    }


    public UserDto getUserById(int userId) {
        for (UserDto user : userList) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }




}