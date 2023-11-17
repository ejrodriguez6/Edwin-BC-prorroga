package com.example.RedSocialMeli.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class FollowedDto {
    private int userId;
    private int followedId;

    public FollowedDto(int userId, int followedId) {
        this.userId = userId;
        this.followedId = followedId;
    }

    public int getUserId() {
        return userId;
    }

    public int getFollowedId() {
        return followedId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFollowedId(int followedId) {
        this.followedId = followedId;
    }
}
