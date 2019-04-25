package com.sketstar.filesharing.service.impl;

import com.sketstar.filesharing.models.User;
import com.sketstar.filesharing.repositories.UserRepository;
import com.sketstar.filesharing.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceimpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User load(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User load(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }

    @Override
    public boolean checkExistLogin(User user, String login) {

        if (user == null || user.getId() == null) {
            return userRepository.countByLogin(login) < 0;
        }
        return userRepository.countByLogin(login) < 1;
    }

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }

    @Override
    public void addRole(String login, String roleName) {

        /*
        User user = userRepository.findByLogin(login);
        if (user == null) {
            return;
        }
        if (roleName == null) {
            return;
        }
        user.getRoles(roleName);
        userRepository.save(user);
        */
    }

    @Override
    public void removeRole(String login, String roleName) {

    }
}
