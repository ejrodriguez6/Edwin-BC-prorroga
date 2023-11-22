package com.example.RedSocialMeli.service;

import com.example.RedSocialMeli.dto.ProductDto;
import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Trae una lista de todos los productos
    public List<ProductDto>  getAllProducts() {
        return productRepository.initProducts();
    }

    //Trae un producto especifico por id
    public ProductDto getProductById(int productId)
    {
        return productRepository.getProductById(productId);

    }
}
