package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.FollowedDto;
import com.example.RedSocialMeli.dto.FollowerDto;
import com.example.RedSocialMeli.dto.FollowersListDto;
import com.example.RedSocialMeli.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
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





   //US 0002
    public int getFollowerIdsCount(int userId) {
        List<Integer> followerIds = new ArrayList<>();

        for (FollowerDto follower : followersList) {
            if (follower.getUserId() == userId) {
                followerIds.add(follower.getFollowerId());
            }
        }

        return followerIds.size();
    }



    //US0007
//    public void removeFollowerUser(int userId, int followerId) {
//        Iterator<FollowerDto> iterator = followersList.iterator();
//        while (iterator.hasNext()) {
//            FollowerDto followerDto = iterator.next();
//            if (followerDto.getUserId() == userId && followerDto.getFollowerId() == followerId) {
//                iterator.remove();
//                return new ArrayList<>(followedList);
//            }
//        }
//    }


    // US0007
    // ==================================
    public List<FollowerDto> removeFollowerUser(int userId, int followerId) {
        Iterator<FollowerDto> iterator = followersList.iterator();
        while (iterator.hasNext()) {
            FollowerDto followerDto = iterator.next();
            if (followerDto.getUserId() == userId && followerDto.getFollowerId() == followerId) {
                iterator.remove();
                // Devolver la lista actualizada después de la eliminación
                return new ArrayList<>(followersList);
            }
        }

        // Si no se encontró la combinación userId y followerId, puedes lanzar una excepción o manejarlo de otra manera
        throw new IllegalArgumentException("No se encontró la combinación userId y followerId en la lista.");
    }
    // ===================================





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
