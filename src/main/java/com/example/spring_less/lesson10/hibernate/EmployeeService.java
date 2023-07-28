package com.example.spring_less.lesson10.hibernate;

public interface EmployeeService {
    void createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
