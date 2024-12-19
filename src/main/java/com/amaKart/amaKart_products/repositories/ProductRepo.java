package com.amaKart.amaKart_products.repositories;

import com.amaKart.amaKart_products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
