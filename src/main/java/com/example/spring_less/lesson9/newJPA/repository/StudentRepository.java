package com.example.spring_less.lesson9.newJPA.repository;

import com.example.spring_less.lesson9.newJPA.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Long> {
    Students findByName(String name);
    Students findById(long id);
}
