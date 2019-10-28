package ru.mishanin.common.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private Long price;

    public ProductDto(Long id, String title, Long price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
