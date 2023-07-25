package com.example.spring_less.lesson2;

import com.example.spring_less.lesson1.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;
    private Pet pet;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean was created");
//        this.pet = pet;
//    }
    public Person() {
        System.out.println("Person bean was created");
    }
    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callPet() {
        System.out.println("Hello pet");
        pet.say();
    }
}
