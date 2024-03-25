package com.example.handleexceptiondemo.user;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository {

    User createUser(User user);
    User updateUser(User user, Integer userId);
    void deleteUser(Integer userId);
    Optional<User> findUserById(Integer userId);
}
