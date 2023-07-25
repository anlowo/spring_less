package com.example.spring_less.lesson6.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("personN")  // Не использует сканирование пакета и поисков бинов. Они описываются в конфиг классе
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
//    private String name;
//    private int age;
    private Pet pet;

    //@Autowired  // Тоже не используется с этим способом
    public Person(@Qualifier("dogdog") Pet pet) {
        System.out.println("Person bean was created");
        this.pet = pet;
    }
//    @Autowired
//    @Qualifier("dog")
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set pet");
//        this.pet = pet;
//    }

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
