package com.example.spring_less.lesson9.newJPA.service;

import com.example.spring_less.lesson9.newJPA.entity.Students;
import com.example.spring_less.lesson9.newJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentsService {
    private final StudentRepository repository;

    @Autowired
    public StudentsService(StudentRepository studentRepository) {
        this.repository = studentRepository;
    }

    public StudentRepository getRepository() {
        return repository;
    }

    public void createStudents(String name, String courses) {
        Students students = new Students();
        students.setName(name);
        students.setCourses(courses);
        repository.save(students);
        System.out.println("\n" + "Пользователь был создан");
    }

    public void readStudents(long id) {
        Students students = repository.findById(id);
        try {
            System.out.println(students.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStudents(long id, String name, String course) {
        Students students = repository.findById(id);
        try {
            students.setName(name);
            students.setCourses(course);
            repository.save(students);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudents(long id) {
        Students students = repository.findById(id);
        try {
            repository.delete(students);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllStudents() {
        List<Students> list = repository.findAll();
        StringBuilder result = new StringBuilder();
        for (Students students : list) {
            result.append(students.getId()).append(" - ")
                    .append(students.getName())
                    .append(" - Course ")
                    .append(students.getCourses()).append("\n");
            System.out.println(result);
        }
    }
}
