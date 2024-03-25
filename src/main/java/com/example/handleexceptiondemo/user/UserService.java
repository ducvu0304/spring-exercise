package com.example.handleexceptiondemo.user;

import java.util.Optional;

public class UserService implements UserRepository{
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Integer userId) {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public Optional<User> findUserById(Integer userId) {
        return Optional.empty();
    }
}
