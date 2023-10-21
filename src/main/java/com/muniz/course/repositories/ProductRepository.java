package com.muniz.course.repositories;

import com.muniz.course.entities.Category;
import com.muniz.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
