package com.example.RedSocialMeli.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private int productId;
    private String productName;
    private String type;
    private String brand;
    private String color;
    private String notes;

}
