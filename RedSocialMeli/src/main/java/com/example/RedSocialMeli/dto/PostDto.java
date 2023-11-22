package com.example.RedSocialMeli.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private int postId;
    private int userId;
    private LocalDate date;
    private ProductDto productDto;
    private int category;
    private double price;
    private boolean hasPromo;
    private double discount;

    public PostDto(int postId, int userId, LocalDate date, ProductDto productDto, int category, double price) {
        this.postId = postId;
        this.userId = userId;
        this.date = date;
        this.productDto = productDto;
        this.category = category;
        this.price = price;
    }
}
