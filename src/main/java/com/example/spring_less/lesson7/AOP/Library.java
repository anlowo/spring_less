package com.example.spring_less.lesson7.AOP;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("Берем книгу");
    }
}
