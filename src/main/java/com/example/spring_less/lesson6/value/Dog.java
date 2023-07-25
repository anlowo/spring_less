package com.example.spring_less.lesson6.value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    Dog() {
        System.out.println("Dog bean has been created");
    }
    @Override
    public void say() {
        System.out.println("Gav");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
