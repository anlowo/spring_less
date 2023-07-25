package com.example.spring_less.lesson6.configuration;


import org.springframework.stereotype.Component;

//@Component("catN")  // Не использует сканирование пакета и поисков бинов. Они описываются в конфиг классе
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean has been created");
    }
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
