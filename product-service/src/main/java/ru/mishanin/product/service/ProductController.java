package ru.mishanin.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mishanin.common.dto.ProductDto;
import ru.mishanin.product.service.services.ProductService;

import java.util.List;

@RestController
public class ProductController implements ProductsInterface{

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public List<ProductDto> productDtos(){
        return productService.findAll();
    }
}
