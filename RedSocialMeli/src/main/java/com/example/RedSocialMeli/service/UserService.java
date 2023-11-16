package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userRepository.initUsers();
    }


}
