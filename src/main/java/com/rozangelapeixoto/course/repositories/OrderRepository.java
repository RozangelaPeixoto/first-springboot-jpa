package com.rozangelapeixoto.course.repositories;

import com.rozangelapeixoto.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
