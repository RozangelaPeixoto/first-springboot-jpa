package com.rozangelapeixoto.course.repositories;

import com.rozangelapeixoto.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
