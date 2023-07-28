package com.example.spring_less.lesson1.application_context;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();

        Pet pet1 = new Cat();
        pet1.say();
    }
}
