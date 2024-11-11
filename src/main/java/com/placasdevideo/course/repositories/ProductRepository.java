package com.placasdevideo.course.repositories;

import com.placasdevideo.course.entities.Category;
import com.placasdevideo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
