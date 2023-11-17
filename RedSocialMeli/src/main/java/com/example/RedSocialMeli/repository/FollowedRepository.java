package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.FollowedDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FollowedRepository {

    // Simular una lista en memoria para relaciones de seguidos
    private List<FollowedDto> followedList = new ArrayList<>();

//    public void followUser(int userId, int followedId) {
//        // Simular que un usuario sigue a otro
//        followedList.add(new FollowedDto(userId, followedId));
//    }

    public void followUser(int userId) {
        // Simular que un usuario sigue a otro
        followedList.add(new FollowedDto(2, 1));
    }

    public List<Integer> getFollowedIds(int userId) {
        // Obtener los IDs de usuarios seguidos por el usuario con ID 'userId'
        return followedList.stream()
                .filter(followed -> followed.getUserId() == userId)
                .map(FollowedDto::getFollowedId)
                .collect(Collectors.toList());
    }
}
