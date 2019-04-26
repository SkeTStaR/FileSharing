package com.sketstar.filesharing.service;

import com.sketstar.filesharing.models.User;

import java.util.List;

public interface UserService {

    User load(Long id);

    User load(String login);

    User save(User user);

    void remove(User user);

    boolean checkExistLogin(User user, String login);

    List<User> all();

    void addRole(String login, String roleName);

    void removeRole(String login, String roleName);
}
