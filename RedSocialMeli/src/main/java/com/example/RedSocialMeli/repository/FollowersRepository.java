package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.FollowedDto;
import com.example.RedSocialMeli.dto.FollowerDto;
import com.example.RedSocialMeli.dto.FollowersListDto;
import com.example.RedSocialMeli.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Repository
public class FollowersRepository {

    private UserRepository userRepository;
    // Simular una lista en memoria para relaciones de seguidores
    private List<FollowerDto> followersList = new ArrayList<>();


    public List<FollowerDto> addFollowerUser(int userId, int followedId) {

        followersList.add(new FollowerDto(userId,followedId));

        return followersList;
    }





    public int getFollowerIdsCount(int userId) {
        List<Integer> followerIds = new ArrayList<>();

        for (FollowerDto follower : followersList) {
            if (follower.getUserId() == userId) {
                followerIds.add(follower.getFollowerId());
            }
        }

        return followerIds.size();
    }







    public List<UserDto> getFollowerList(int userId) {
        List<UserDto> followerList = new ArrayList<>();

        for (FollowerDto follower : followersList) {
            if (follower.getUserId() == userId) {
                UserDto userDto = userRepository.getUserById(userId);

                followerList.add(new UserDto(userDto.getUserId(), userDto.getUserName()));

            }
        }

        return followerList;
    }


    //    Se recorre la lista de seguidores y se verifica si el userId coincide.
//    Si es así, se agrega el followerId a la lista de IDs de seguidores.

    public List<Integer> getFollowerIds(int userId) {
        List<Integer> followerIds = new ArrayList<>();

        for (FollowerDto follower : followersList) {
            if (follower.getUserId() == userId) {
                followerIds.add(follower.getFollowerId());
            }
        }

        return followerIds;
    }











}
