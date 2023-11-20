package com.example.RedSocialMeli.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FollowersCountDto {
    private int userId;
    private String userName;
    private int followersCount;

    public FollowersCountDto(int userId, String userName, int followersCount) {
        this.userId = userId;
        this.userName = userName;
        this.followersCount = followersCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }
}
