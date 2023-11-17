package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.dto.UserWithFollowersDto;
import com.example.RedSocialMeli.repository.FollowedRepository;
import com.example.RedSocialMeli.repository.FollowersRepository;
import com.example.RedSocialMeli.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserRepository userRepository;

    private FollowersRepository followersRepository;
    private FollowedRepository followedRepository;





    public UserService(FollowersRepository followersRepository, FollowedRepository followedRepository, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.followedRepository = followedRepository;
        this.followersRepository = followersRepository;
    }

    //Trae una lista de todos los usuarios
    public List<UserDto> getAllUsers() {
        return userRepository.initUsers();
    }

    //Trae un usuario especifico por id
    public UserDto getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    // Trae una lista de usuarios id, nombre, lista de seguidores y lista de seguidos
    public UserWithFollowersDto getUserWithFollowers(int userId) {
        UserDto userDto = userRepository.getUserById(userId);
        List<Integer> followedIds = followedRepository.getFollowedIds(userId);
        List<Integer> followerIds = followersRepository.getFollowerIds(userId);

       return new UserWithFollowersDto(userDto.getUserId(), userDto.getUserName(), followerIds, followedIds);

    }


}
