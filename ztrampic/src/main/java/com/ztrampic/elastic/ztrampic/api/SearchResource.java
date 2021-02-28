package com.ztrampic.elastic.ztrampic.api;

import com.ztrampic.elastic.ztrampic.model.User;
import com.ztrampic.elastic.ztrampic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/search")
@CrossOrigin
public class SearchResource {

    private final UserService userService;

    @Autowired
    public SearchResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public Set<User> searchByName(@PathVariable final String name) {
        return userService.findByName(name);
    }

    @GetMapping("/all")
    public Set<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/byRole/{roleName}")
    public Set<User> searchByRoleName(@PathVariable final String roleName){
        Set<User> users = userService.findByRoleName(roleName);
        return users;
    }

    @GetMapping("/filter/{roleName}/{tag}")
    public Set<User> searchByRoleAndTag(@PathVariable final String roleName, @PathVariable final String tag){
        return userService.findByRoleNameAndFilteredByTag(roleName, tag);
    }


}
