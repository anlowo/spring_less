package com.example.spring_less.homework.hw1.service;

import com.example.spring_less.homework.hw1.entity.ItUser;
import com.example.spring_less.homework.hw1.repository.ItUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
public class ItUserService {
    private final ItUserRepository repository;

    @Autowired
    public ItUserService(ItUserRepository repository) {
        this.repository = repository;
    }

    public ItUserRepository getRepository() {
        return repository;
    }

    public void createItUser(String firstName, String lastName, String patronymic, double roomNumber, LocalDateTime localDateTime) {
        ItUser itUser = new ItUser();
        itUser.setFirstName(firstName);
        itUser.setLastName(lastName);
        itUser.setPatronymic(patronymic);
        itUser.setRoomNumber(roomNumber);
        itUser.setCreateAt(localDateTime);
        repository.save(itUser);
        System.out.println("\n" + "Пользователь был создан" + "\n");
    }

    public void readItUser(long id) {
        ItUser itUser = repository.findById(id);
        try {
            String result = "id - " + itUser.getId() +
                    " - First Name - " + itUser.getFirstName() +
                    " - Last Name - " + itUser.getLastName() +
                    " - Patronymic - " + itUser.getPatronymic() +
                    " - Room Number - " + itUser.getRoomNumber() +
                    " - Was created " + itUser.getCreateAt() +
                    "\n";
            System.out.println(result);
        } catch (VisitorNotFoundException e) {
            throw new VisitorNotFoundException("Пользователь не найден");
        }
    }

    public void updateItUser(long id, String firstName, String lastName, String patronymic, double roomNumber, LocalDateTime localDateTime) {
        ItUser itUser = repository.findById(id);
        try {
            itUser.setFirstName(firstName);
            itUser.setLastName(lastName);
            itUser.setPatronymic(patronymic);
            itUser.setRoomNumber(roomNumber);
            itUser.setUpdateAt(localDateTime);
            repository.save(itUser);
        } catch (VisitorNotFoundException e) {
            throw new VisitorNotFoundException("Пользователь не найден");
        }
    }

    public void deleteItUser(long id, LocalDateTime localDateTime) {
        ItUser itUser = repository.findById(id);
        try {
            itUser.setExitDate(localDateTime);
            repository.delete(itUser);
        } catch (VisitorNotFoundException e) {
            throw new VisitorNotFoundException("Пользователь не найден");
        }
    }

    public void readAllItUsers() {
        List<ItUser> itUsers = repository.findAll();
        for (ItUser itUser : itUsers) {
            String result = "id - " + itUser.getId() +
                    " - First Name - " + itUser.getFirstName() +
                    " - Last Name - " + itUser.getLastName() +
                    " - Patronymic - " + itUser.getPatronymic() +
                    " - Room Number - " + itUser.getRoomNumber() +
                    " - Was created " + itUser.getCreateAt() +
                    "\n";
            System.out.println(result);
        }
//        StringBuilder result = new StringBuilder();
//        for (ItUser itUser : itUsers) {
//            result.append("id - ").append(itUser.getId())
//                    .append(" - First Name - ").append(itUser.getFirstName())
//                    .append(" - Last Name - ").append(itUser.getLastName())
//                    .append(" - Patronymic - ").append(itUser.getPatronymic())
//                    .append(" - Room Number - ").append(itUser.getRoomNumber())
//                    .append(" - Was created ").append(itUser.getCreateAt())
//                    .append("\n");
//            System.out.println(result);
//        }
//        for (ItUser itUser : itUsers) {
//            String result = "id - " + itUser.getId() +
//                    " - First Name - " + itUser.getFirstName() +
//                    " - Last Name - " + itUser.getLastName() +
//                    " - Patronymic - " + itUser.getPatronymic() +
//                    " - Room Number - " + itUser.getRoomNumber() +
//                    " - Was created " + itUser.getCreateAt() +
//                    "\n";
//            System.out.println(result);
//        }
    }
}
