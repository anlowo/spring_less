package com.example.spring_less.lesson9.newJPA.service;

import com.example.spring_less.lesson9.newJPA.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUi implements CommandLineRunner {
    private final StudentsService studentsService;
    ConsoleUi consoleUi;

    @Autowired
    ConsoleUi(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Вывести студента");
            System.out.println("2. Вывести всех студентов");
            System.out.println("3. Обновить студента");
            System.out.println("4. Удалить студента");
            System.out.println("5. Выход с программы");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:

                case 3:
                    readAllStudent();
                    break;
                case 4:
                    updateStudent(scanner);
                    break;
                case 5:
                    deleteStudent(scanner);
                    break;
                case 6:
                    System.out.println("Выйти с программы");
                default:
                    System.out.println("Данные введены верно");
            }
        }
    }

    private void addStudent(Scanner scanner) {
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите курс: ");
        String course = scanner.next();
        studentsService.createStudents(name, course);
        System.out.println("Студент создан\n");
    }
    private void readStudent(Scanner scanner) {
        System.out.println("Введите айди студента :");
        long id = scanner.nextInt();
        studentsService.readStudents(id);
    }

    private void readAllStudent() {
        System.out.println("Все студенты: ");
        studentsService.getAllStudents();
    }

    private void updateStudent(Scanner scanner) {
        System.out.println("Введите id студента: ");
        long id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите новое имя: ");
        String name = scanner.next();
        System.out.println("Введите новый курс: ");
        String course = scanner.next();
        Students students = new Students();
        students.setId(id);
        students.setName(name);
        students.setCourses(course);
        studentsService.updateStudents(id, name, course);
        System.out.println("Студент обнавлен\n");
    }

    private void deleteStudent(Scanner scanner) {
        System.out.println("Введите имя");
        long id = scanner.nextLong();
        studentsService.deleteStudents(id);
        System.out.println("Студент удален\n");
    }
}
