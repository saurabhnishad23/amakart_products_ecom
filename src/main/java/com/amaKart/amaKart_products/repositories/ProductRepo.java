package com.amaKart.amaKart_products.repositories;

import com.amaKart.amaKart_products.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
  Page<Product> findAll (Pageable pageable);
}
