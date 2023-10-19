package com.muniz.course.repositories;

import com.muniz.course.entities.Category;
import com.muniz.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
