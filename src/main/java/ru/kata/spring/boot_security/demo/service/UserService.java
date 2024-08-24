package ru.kata.spring.boot_security.demo.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getListUser();

    @Transactional
    void save(User newUser);

    @Transactional
    void update(User updateUser);

    @Transactional
    void delete(long id);

    User getUser(long id);

    Object getAuthCurrentUser();

}
