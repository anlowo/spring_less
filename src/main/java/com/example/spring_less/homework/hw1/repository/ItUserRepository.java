package com.example.spring_less.homework.hw1.repository;

import com.example.spring_less.homework.hw1.entity.ItUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItUserRepository extends JpaRepository<ItUser, Long> {
    ItUser findById(long id);
}
