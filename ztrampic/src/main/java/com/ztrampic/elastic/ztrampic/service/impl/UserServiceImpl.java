package com.ztrampic.elastic.ztrampic.service.impl;

import com.ztrampic.elastic.ztrampic.model.User;
import com.ztrampic.elastic.ztrampic.repository.UserRepository;
import com.ztrampic.elastic.ztrampic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Set<User> getAll() {
        Iterable<User> users = userRepository.findAll();
        Set<User> userSet = new HashSet<>();
        users.forEach(user ->{
            userSet.add(user);
        });
        return userSet;
    }

    @Override
    public Set<User> findByRoleName(String roleName) {
        return userRepository.findByRoleName(roleName);
    }

    @Override
    public Set<User> findByRoleNameAndFilteredByTag(String roleName, String tag) {
        return userRepository.findByRoleNameFilteredByTag(roleName, tag);
    }
}
