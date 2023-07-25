package com.example.spring_less.lesson10;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id  // Столбец с Primary Key содержит уникальное значение и не может быть null
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "{$}")
    private String fullName;
    private int salary;
    Employee(String name, int salary) {
        this.fullName = name;
        this.salary = salary;
    }
}
