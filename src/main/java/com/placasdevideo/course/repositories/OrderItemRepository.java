package com.placasdevideo.course.repositories;

import com.placasdevideo.course.entities.OrderItem;
import com.placasdevideo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
