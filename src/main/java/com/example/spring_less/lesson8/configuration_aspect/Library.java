package com.example.spring_less.lesson8.configuration_aspect;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook(Book book) {
        System.out.println("Берем книгу " + book.getName());
    }
    public void returnBook() {
        System.out.println("Возвращаем книгу");
    }
    public void getMagazine() {
        System.out.println("Берем журнал");
    }
}
