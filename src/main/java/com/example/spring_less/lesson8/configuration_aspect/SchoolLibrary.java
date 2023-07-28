package com.example.spring_less.lesson8.configuration_aspect;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Берем книгу из школьной библиотеки");
    }
}
