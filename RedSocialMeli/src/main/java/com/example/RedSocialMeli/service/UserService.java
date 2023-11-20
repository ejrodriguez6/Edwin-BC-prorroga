package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.*;
import com.example.RedSocialMeli.repository.FollowedRepository;
import com.example.RedSocialMeli.repository.FollowersRepository;
import com.example.RedSocialMeli.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    // US 0001 Seguir a un determinado vendedor
    public List<FollowedDto>  addFollowedUser(int userId, int followedId) {



        if (userId == followedId) {

            throw new IllegalArgumentException("userId y followedId no pueden ser iguales. Por favor, proporciona valores diferentes.");
        }

        UserDto userDto = userRepository.getUserById(followedId);
        UserTypeEnumDto getUserType = userDto.getUserTypeEnumDto();
        if(!getUserType.equals( UserTypeEnumDto.VENDEDOR)){

            throw new IllegalArgumentException("Solo puedes seguir a VENDEDORES");

        }


//        FollowedDto followedDto = followedDto.getFollowedId(userId);
//       if (userDto.getUserId() == )

//        if (user.getFollowed().contains(userIdToFollow)) {
//            throw new BadRequestException("Ya sigue al usuario");
//        }

        getFollowedIds(userId);

        if (userDto.){

        }

        List<FollowedDto>   addFollowedUser = followedRepository.addFollowedUser(userId, followedId);
        List<FollowerDto>   addFollowersUser =  followersRepository.addFollowerUser(followedId, userId);

        return addFollowedUser;
    }



    // US 0002: Obtener el resultado de la cantidad de usuarios que siguen a un determinado vendedor
    public FollowersCountDto getFollowersCount(int userId){
        UserDto getUser = userRepository.getUserById(userId);
        int getFollowerIdsCount = followersRepository.getFollowerIdsCount(userId);

        return new FollowersCountDto(getUser.getUserId(), getUser.getUserName(), getFollowerIdsCount);

    }




    // US 0003: Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)
//    public FollowersListDto getFollowersList(int userId){
//        UserDto userDto = userRepository.getUserById(userId);
//        List<UserDto> followerList = followersRepository.getFollowerList(userId);
//
//        return new FollowersListDto(userDto.getUserId(), userDto.getUserName(), followerList);
//
//    }

    // US 0003: Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)
    // Solo trae para los followers tipo de dato List<Integuer>
    public FollowersListDto getFollowersIds(int userId){
        UserDto userDto = userRepository.getUserById(userId);
        List<Integer> followerIds = followersRepository.getFollowerIds(userId);

        return new FollowersListDto(userDto.getUserId(), userDto.getUserName(), followerIds);
    }

    // US 0003: Obtener un listado de todos los usuarios que siguen a un determinado vendedor (¿Quién me sigue?)
    // Solo trae para los followers tipo de dato List<Integuer>
    public FollowedListDto getFollowedIds(int userId){
        UserDto userDto = userRepository.getUserById(userId);
        List<Integer> followedIds = followedRepository.getFollowedIds(userId);

        return new FollowedListDto(userDto.getUserId(), followedIds);
    }





}
