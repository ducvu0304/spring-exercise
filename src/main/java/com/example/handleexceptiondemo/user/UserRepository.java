package com.example.handleexceptiondemo.user;

public interface UserRepository {

    User createUser(User user);
    User updateUser(User user, Integer userId);
    void deleteUser(Integer userId);
}
