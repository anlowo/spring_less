package com.example.spring_less.homework.hw1.service;

import com.example.spring_less.homework.hw1.entity.ItUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

@Component
public class ItUsersConsoleUi implements CommandLineRunner {
    private final ItUserService itUserService;

    @Autowired
    ItUsersConsoleUi(ItUserService itUserService) {
        this.itUserService = itUserService;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("""

                    Выберите действие:
                    """);
            System.out.println("1. Добавить пользователя");
            System.out.println("2. Вывести пользователя");
            System.out.println("3. Вывести всех пользователей");
            System.out.println("4. Обновить пользователя");
            System.out.println("5. Удалить пользователя");
            System.out.println("6. Выход с программы");
            System.out.println("\n" + "Введите число: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    readStudent(scanner);
                    break;
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
                    exit = true;
                    System.out.println("Выйти с программы");
                    break;
                default:
                    throw new VisitorNotFoundException("Данные введены нерпавильно");
            }
        }
    }

    private void addStudent(Scanner scanner) {
        System.out.println("Введите имя: ");
        String firstName = scanner.next();
        System.out.println("Введите фамилию: ");
        String lastName = scanner.next();
        System.out.println("Введите отчество: ");
        String patronymic = scanner.next();
        System.out.println("Введите номер аудитории: ");
        double roomNumber = 0;
        try {
            roomNumber = scanner.nextDouble();
            roomNumber++;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        itUserService.createItUser(firstName, lastName, patronymic, roomNumber, localDateTime);
        System.out.println("Студент создан\n");
    }
    private void readStudent(Scanner scanner) {
        System.out.println("Введите айди пользователя :");
        long id = scanner.nextInt();
        itUserService.readItUser(id);
    }

    private void readAllStudent() {
        System.out.println("Все студенты: \n");
        itUserService.readAllItUsers();
    }

    private void updateStudent(Scanner scanner) {
        System.out.println("Введите id пользователя: ");
        long id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите новое имя: ");
        String firstName = scanner.next();
        System.out.println("Введите новую фамилию: ");
        String lastName = scanner.next();
        System.out.println("Введите новое отчество: ");
        String patronymic = scanner.next();
        System.out.println("Введите новый номер аудитории: ");
        double roomNumber = 0;
        try {
            roomNumber = scanner.nextDouble();
            roomNumber++;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        ItUser itUser = new ItUser();
        itUser.setId(id);
        itUser.setFirstName(firstName);
        itUser.setLastName(lastName);
        itUser.setPatronymic(patronymic);
        itUser.setRoomNumber(roomNumber);
        LocalDateTime localDateTime = LocalDateTime.now();
        itUserService.updateItUser(id, firstName, lastName, patronymic, roomNumber, localDateTime);
        System.out.println("Студент обнавлен\n");
    }

    private void deleteStudent(Scanner scanner) {
        System.out.println("Введите айди: ");
        long id = scanner.nextLong();
        LocalDateTime localDateTime = LocalDateTime.now();
        itUserService.deleteItUser(id, localDateTime);
        System.out.println("Пользователь удален\n");
    }
}
