package com.balashovmaksim.taco.dto;

import lombok.Data;

@Data
public class IngredientReadDto {
    private String id;
    private String name;
    private String type;
    private Double price;

}
