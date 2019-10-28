package ru.mishanin.product.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mishanin.common.dto.ProductDto;
import ru.mishanin.product.service.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<ProductDto> findAll(){
        return productRepository.findAll()
                .stream()
                .map(item->new ProductDto(item.getId(),item.getTitle(),item.getPrice()))
                .collect(Collectors.toList());
    }
}
