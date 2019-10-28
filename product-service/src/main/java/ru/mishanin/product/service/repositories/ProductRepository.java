package ru.mishanin.product.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mishanin.product.service.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
