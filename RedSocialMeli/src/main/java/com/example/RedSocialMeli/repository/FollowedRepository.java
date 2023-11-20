package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.FollowedDto;
import com.example.RedSocialMeli.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Repository
public class FollowedRepository {

    // Simular una lista en memoria para relaciones de seguidos
    private List<FollowedDto> followedList = new ArrayList<>();



    public List<FollowedDto> addFollowedUser(int userId, int followedId) {

        followedList.add(new FollowedDto(userId,followedId));

        return followedList;
    }




//    Se recorre la lista de usuarios seguidos y se verifica si el userId coincide.
//    Si es así, se agrega el followedId a la lista de IDs de usuarios seguidos.

    public List<Integer> getFollowedIds(int userId) {
        List<Integer> followedIds = new ArrayList<>();

        for (FollowedDto followed : followedList) {
            if (followed.getUserId() == userId) {
                followedIds.add(followed.getFollowedId());
            }
        }

        return followedIds;
    }




}
