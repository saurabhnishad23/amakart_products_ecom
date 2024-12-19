package com.amaKart.amaKart_products.repositories;

import com.amaKart.amaKart_products.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
