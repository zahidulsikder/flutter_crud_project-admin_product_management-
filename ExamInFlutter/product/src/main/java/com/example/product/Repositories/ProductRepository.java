package com.example.product.Repositories;

import org.springframework.data.domain.Page;
import com.example.product.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByNameContainingIgnoreCase(String productName, Pageable pageable);

}
