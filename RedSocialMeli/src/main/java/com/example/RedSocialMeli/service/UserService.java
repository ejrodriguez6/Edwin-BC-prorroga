
package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.*;
import com.example.RedSocialMeli.repository.FollowedRepository;
import com.example.RedSocialMeli.repository.FollowersRepository;
import com.example.RedSocialMeli.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Comparator;
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



    //*************************************US



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

        List<Integer> followedIds =  getFollowedIds(userId);


//        if (!followedIds.contains(followedId)){
//            throw new IllegalArgumentException("VENDEDOR NO EXISTE");
//       }



        if (followedIds.contains(followedId)){
            throw new IllegalArgumentException("Ya sigues a este VENDEDOR");
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
    public FollowersListDto getFollowersList(int userId, NameOrderEnumDto nameOrder){
        UserDto userDto = userRepository.getUserById(userId);
        List<Integer> followerIds = followersRepository.getFollowerIds(userId);

        // Crear FollowersListDto
        FollowersListDto followersListDto = new FollowersListDto();
        followersListDto.setUserId(userDto.getUserId());
        followersListDto.setUserName(userDto.getUserName());

        // Obtener información de los seguidores y agregarla a la lista
        List<UserDto> followers = new ArrayList<>();
        for (Integer followerId : followerIds) {
            UserDto followerDto = userRepository.getUserById(followerId);


//            UserDto follower = new UserDto();
//            follower.setUserId(followerDto.getUserId());
//            follower.setUserName(followerDto.getUserName());
//            followers.add(followerDto);



            followers.add(followerDto);
        }
        sortUserDtoList(followers, nameOrder);

        followersListDto.setFollowers(followers);

        return followersListDto;

    }

    //US 0004: Obtener un listado de todos los vendedores a los cuales sigue un determinado usuario (¿A quién sigo?)
    public FollowedListDto getFollowedList(int userId, NameOrderEnumDto nameOrder){
        UserDto userDto = userRepository.getUserById(userId);
        List<Integer> followedIds = followedRepository.getFollowedIds(userId);

        // Crear FollowersListDto
        FollowedListDto followedListDto = new FollowedListDto();
        followedListDto.setUserId(userDto.getUserId());
        followedListDto.setUserName(userDto.getUserName());

        // Obtener información de los seguidos y agregarla a la lista
        List<UserDto> followeds = new ArrayList<>();
        for (Integer followedId : followedIds) {
            UserDto followedDto = userRepository.getUserById(followedId);

            followeds.add(followedDto);
        }
        sortUserDtoList(followeds, nameOrder);

        followedListDto.setFollowed(followeds);



        return followedListDto;
    }


  //  US 0007: Poder realizar la acción de “Unfollow” (dejar de seguir) a un determinado vendedor.
//  public void unfollowUser(int userId, int userIdToUnfollow) {

    public  List<FollowedDto> unfollowUser(int userId, int userIdToUnfollow) {

      if (userId == userIdToUnfollow) {

          throw new IllegalArgumentException("userId y followedId no pueden ser iguales. Por favor, proporciona valores diferentes.");

      }

      UserDto user = userRepository.getUserById(userId);
      UserDto userToUnfollow = userRepository.getUserById(userId);

      List<Integer> followedIds =  getFollowedIds(userId);
      if (!followedIds.contains(userIdToUnfollow)){
          throw new IllegalArgumentException("No sigue al VENDEDOR ingresado");
      }

        List<FollowedDto>  removeFollowedUser = followedRepository.removeFollowedUser(userId, userIdToUnfollow);
        List<FollowerDto> removeFollowersUser = followersRepository.removeFollowerUser(userIdToUnfollow, userId);



        return removeFollowedUser;
  }



  //*************************************US




    // Me trae una lista de ids de followed
    public List<Integer> getFollowedIds(int userId){
        List<Integer> followedIds = followedRepository.getFollowedIds(userId);
        return followedIds;


    }

    // Me trae una lista de ids de followers
    public List<Integer> getFollowersIds(int userId){
        List<Integer> followersIds = followersRepository.getFollowerIds(userId);
        return followersIds;

    }

    // Método para ordenar una lista de UserDto
    private void sortUserDtoList(List<UserDto> listToSort, NameOrderEnumDto criteria) {
        // Crear comparador para ordenar por nombre de usuario
        Comparator<UserDto> usernameComparator = new Comparator<UserDto>() {
            @Override
            public int compare(UserDto user1, UserDto user2) {
                return user1.getUserName().compareTo(user2.getUserName());

            }
        };

        // Ordenar dependiendo del criterio de entrada
        if (criteria == NameOrderEnumDto.name_desc) {
            listToSort.sort(usernameComparator.reversed());
        } else {
            listToSort.sort(usernameComparator);
        }
    }




}
