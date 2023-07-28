package com.example.spring_less.lesson10.hibernate;

public interface EmployeeDAO {
    void create(Employee employee);
    Employee getById(Long id);
    void update(Employee employee);
    void delete(Employee employee);
}
