package com.example.RedSocialMeli.dto;

import java.util.List;

public class UserWithFollowersDto {

    private int userId;
    private String userName;
    private List<Integer> followers;
    private List<Integer> followed;

    public UserWithFollowersDto(int userId, String userName, List<Integer> followers, List<Integer> followed) {
        this.userId = userId;
        this.userName = userName;
        this.followers = followers;
        this.followed = followed;
    }

    @Override
    public String toString() {
        return "UserWithFollowersDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", followers=" + followers +
                ", followed=" + followed +
                '}';
    }
}
