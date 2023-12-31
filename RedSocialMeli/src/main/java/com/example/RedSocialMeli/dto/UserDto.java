package com.example.RedSocialMeli.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private int userId;
    private String userName;
    private UserTypeEnumDto userTypeEnumDto;



    public UserDto(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}