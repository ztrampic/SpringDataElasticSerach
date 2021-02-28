package com.ztrampic.elastic.ztrampic.service;

import com.ztrampic.elastic.ztrampic.model.User;

import java.util.Set;

public interface UserService {
    Set<User> findByName(String name);
    Set<User> getAll();
    Set<User> findByRoleName(String roleName);
    Set<User> findByRoleNameAndFilteredByTag(String roleName, String tag);
}
