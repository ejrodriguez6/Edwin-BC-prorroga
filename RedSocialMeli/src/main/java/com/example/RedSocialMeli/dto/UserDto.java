package com.example.RedSocialMeli.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
//@AllArgsConstructor
public class UserDto {

//    private Long user_id;
//    private String user_name;
 //   private UserTypeEnumDto userTypeEnumDto;

    private int userId;
    private String userName;

    public UserDto(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}