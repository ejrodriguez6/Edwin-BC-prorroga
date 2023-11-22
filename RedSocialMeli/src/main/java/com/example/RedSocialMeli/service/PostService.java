package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.PostDto;
import com.example.RedSocialMeli.dto.ProductDto;
import com.example.RedSocialMeli.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //Trae una lista de todos los posts
    public List<PostDto> getAllPosts() {
        return postRepository.initPosts();

    }

    //Trae un post especifico por id
    public PostDto getPostById(int postId)
    {
        return postRepository.getPostById(postId);


    }
}
