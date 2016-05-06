package com.app.myapplication.service;

import com.app.myapplication.model.User;

import java.util.List;

/**
 * Created by maverma on 30/04/16.
 */
public interface UserService {

    User findById(long id);

    User findByName(String name);

    boolean saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}
