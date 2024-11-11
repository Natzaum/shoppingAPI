package com.placasdevideo.course.repositories;

import com.placasdevideo.course.entities.Category;
import com.placasdevideo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
