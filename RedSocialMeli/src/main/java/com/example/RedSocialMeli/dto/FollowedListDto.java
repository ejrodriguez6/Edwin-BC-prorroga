package com.example.RedSocialMeli.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowedListDto {

    private int userId;
    private String userName;
    private List<Integer> followed;

    public FollowedListDto(int userId, List<Integer> followed) {
        this.userId = userId;
        this.followed = followed;
    }
}
