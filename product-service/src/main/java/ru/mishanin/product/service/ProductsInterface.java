package ru.mishanin.product.service;

import org.springframework.web.bind.annotation.RequestMapping;
import ru.mishanin.common.dto.ProductDto;

import java.util.List;

public interface ProductsInterface {
    @RequestMapping("/products")
    List<ProductDto> productDtos();
}
