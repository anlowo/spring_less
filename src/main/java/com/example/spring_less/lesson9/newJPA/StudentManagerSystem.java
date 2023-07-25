package com.example.spring_less.lesson9.newJPA;

import com.example.spring_less.lesson9.newJPA.service.StudentsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class StudentManagerSystem {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StudentManagerSystem.class, args);

        SwingUtilities.invokeLater(() -> {
            StudentsService studentService = context.getBean(StudentsService.class);
//            StudentForm studentForm = new StudentForm(studentService);
//            studentForm.setVisible(true);
        });
    }
}
