package com.example.spring_less.lesson6.config_value.value;

import com.example.spring_less.lesson1.application_context.Pet;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean has been created");
    }
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
