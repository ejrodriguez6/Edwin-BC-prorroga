package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.FollowerDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FollowersRepository {

    // Simular una lista en memoria para relaciones de seguidores
    private List<FollowerDto> followersList = new ArrayList<>();

//    public void addFollower(int userId, int followerId) {
//        // Simular que un usuario tiene un seguidor
//        followersList.add(new FollowerDto(userId, followerId));
//    }

    public void addFollower(int userId) {
        // Simular que un usuario tiene un seguidor
        followersList.add(new FollowerDto(1, 2));
    }

    public List<Integer> getFollowerIds(int userId) {
        // Obtener los IDs de usuarios que siguen al usuario con ID 'userId'
        return followersList.stream()
                .filter(follower -> follower.getUserId() == userId)
                .map(FollowerDto::getFollowerId)
                .collect(Collectors.toList());
    }
}
