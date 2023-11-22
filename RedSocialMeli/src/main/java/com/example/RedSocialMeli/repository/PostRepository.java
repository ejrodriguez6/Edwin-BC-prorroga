package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.PostDto;
import com.example.RedSocialMeli.dto.ProductDto;
import com.example.RedSocialMeli.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    private List<PostDto> postList = new ArrayList<>();

    private  ProductRepository productRepository;

    // Inyecta ProductRepository en el constructor
    @Autowired
    public PostRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Formato de la cadena
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public List<PostDto> initPosts() {

        // Obtén la lista de productos del ProductRepository

      //  List<ProductDto> productList = productRepository.initProducts();


        postList.add(new PostDto(1, 4, LocalDate.parse("2023-11-01", formatter),productRepository.getProductById(1) , 100, 300));
        postList.add(new PostDto(2, 4, LocalDate.parse("2023-11-19", formatter), productRepository.getProductById(2),200, 500 ));
        postList.add(new PostDto(3, 5,  LocalDate.parse("2023-11-22", formatter), productRepository.getProductById(5), 50, 1000));
        postList.add(new PostDto(4, 5,  LocalDate.parse("2023-11-15", formatter), productRepository.getProductById(6), 50, 1200));
        postList.add(new PostDto(5, 5,  LocalDate.parse("2023-11-04", formatter), productRepository.getProductById(7), 50, 3000));
        postList.add(new PostDto(6, 5,  LocalDate.parse("2023-10-13", formatter), productRepository.getProductById(8), 50, 3200));
        postList.add(new PostDto(7, 6,  LocalDate.parse("2023-11-18", formatter), productRepository.getProductById(10), 10, 100000));
        postList.add(new PostDto(8, 6,  LocalDate.parse("2023-11-02", formatter), productRepository.getProductById(9), 10, 100300));


        return postList;
    }

    public PostDto getPostById(int postId) {
        for (PostDto post : postList) {
            if (post.getPostId() == postId) {
                return post;
            }
        }
        return null;
    }
}
