package com.rozangelapeixoto.course.repositories;

import com.rozangelapeixoto.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
