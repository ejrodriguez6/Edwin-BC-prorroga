package com.example.RedSocialMeli.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowersListDto {

    private int userId;
    private String userName;
    private  List<Integer> followers;
  //  private List<UserDto> followers;
}
