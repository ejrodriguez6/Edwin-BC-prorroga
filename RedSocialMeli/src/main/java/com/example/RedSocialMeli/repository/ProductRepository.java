package com.example.RedSocialMeli.repository;

import com.example.RedSocialMeli.dto.ProductDto;
import com.example.RedSocialMeli.dto.UserDto;
import com.example.RedSocialMeli.dto.UserTypeEnumDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<ProductDto> productList = new ArrayList<>();


    public List<ProductDto> initProducts() {

        productList.add(new ProductDto(1, "Silla Gamer", "Gamer", "Racer", "Negro", "Edicion especial"));
        productList.add(new ProductDto(2, "Mouse", "Gamer",  "Logitech", "Rojo", "Inalambrico"));
        productList.add(new ProductDto(3, "Remera", "Algodon", "Puma", "Celeste", "Edicion Centenario"));
        productList.add(new ProductDto(4, "Remera", "Algodon", "Nike", "Blanco", "Edicion Soccer"));
        productList.add(new ProductDto(5, "Celular", "Celular", "Samsung", "Negro", "Samsung S22"));
        productList.add(new ProductDto(6, "Celular", "Celular", "Samsung", "Blanco", "Samsung A50"));
        productList.add(new ProductDto(7, "Celular", "Celular", "Apple", "Gris", "IPhone 8"));
        productList.add(new ProductDto(8, "Celular", "Celular", "Apple", "Morado", "IPhone 11"));
        productList.add(new ProductDto(9, "Auto", "Auto usado", "Ford", "Gris claro", "Ford Fiesta"));
        productList.add(new ProductDto(10, "Auto", "Auto usado", "Chevrolet", "Blanco", "Chevrolet Prisma"));

        return productList;
    }

    public ProductDto getProductById(int productId) {
        for (ProductDto product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}
