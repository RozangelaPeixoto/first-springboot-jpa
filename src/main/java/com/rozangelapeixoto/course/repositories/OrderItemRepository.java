package com.rozangelapeixoto.course.repositories;

import com.rozangelapeixoto.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
