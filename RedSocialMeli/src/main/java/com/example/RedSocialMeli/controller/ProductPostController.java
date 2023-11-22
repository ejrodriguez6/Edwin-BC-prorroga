package com.example.RedSocialMeli.controller;

import com.example.RedSocialMeli.dto.PostDto;
import com.example.RedSocialMeli.dto.ProductDto;
import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.service.PostService;
import com.example.RedSocialMeli.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductPostController {

    private ProductService productService;
    private PostService postService;

    public ProductPostController(ProductService productService, PostService postService) {
        this.productService = productService;
        this.postService = postService;
    }

    // Obtener mensaje desde el controlador
    @GetMapping("/hello")
    public String hello() {

        return "Hello Product! ";
    }
   // Obtengo una lista de todos los productos
    @GetMapping("/list")
    public List<ProductDto> getAllProducts() {

        return productService.getAllProducts();
    }

    // Obtengo una lista de todos los posts
    @GetMapping("/posts")
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();

    }

    // Obtener un producto por id producto
    @GetMapping("/list/{id}")
    public ProductDto getProductById(@PathVariable int id) {
        return  productService.getProductById(id);

    }

    // Obtener un post por id post
    @GetMapping("/posts/{id}")
    public PostDto getPostById(@PathVariable int id) {
        return postService.getPostById(id);


    }

}
