package com.example.spring_less.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    @Autowired
    Dog() {
        System.out.println("Dog bean has been created");
    }
    @Override
    public void say() {
        System.out.println("Gav");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
