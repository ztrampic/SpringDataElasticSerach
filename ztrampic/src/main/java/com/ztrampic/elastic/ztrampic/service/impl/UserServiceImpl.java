package com.ztrampic.elastic.ztrampic.service.impl;

import com.ztrampic.elastic.ztrampic.model.User;
import com.ztrampic.elastic.ztrampic.repository.UserRepository;
import com.ztrampic.elastic.ztrampic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Set<User> findByName(String name) {
        Set<User> result = userRepository.findByName(name);
        return result;
    }

    @Override
    @Transactional
    public Set<User> getAll() {
//        Set<User> mockData = new HashSet<>();
//        mockData.add(new User(1L,"Zarko", "Trampic", "ztrampic"));
//        mockData.add(new User(2L,"Pera", "Peric", "pperic"));
//        mockData.add(new User(3L,"Mika", "Mikic", "mmikic"));
//        mockData.add(new User(4L,"Zivana", "Zivanovic", "zzivanovic"));
//        userRepository.saveAll(mockData);
        Iterable<User> users = userRepository.findAll();
        Set<User> userSet = new HashSet<>();
                users.forEach(user -> {
            userSet.add(user);
        });
        return userSet;
    }
}
