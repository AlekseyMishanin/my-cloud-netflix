package ru.mishanin.eureka.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mishanin.common.dto.ProductDto;

import java.util.List;

@FeignClient("product-service")
public interface ProductsInterfaceClient {
    @RequestMapping("/products")
    List<ProductDto> productDtos();
}
