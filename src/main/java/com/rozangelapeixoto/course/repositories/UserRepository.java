package com.rozangelapeixoto.course.repositories;

import com.rozangelapeixoto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
