package com.example.RedSocialMeli.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class FollowerDto {
//    private int user_id;
//    private String user_name;
//    private List<UserDto> followers;

    private int userId;
    private int followerId;

    public FollowerDto(int userId, int followerId) {
        this.userId = userId;
        this.followerId = followerId;
    }

    public int getUserId() {
        return userId;
    }

    public int getFollowerId() {
        return followerId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }
}
