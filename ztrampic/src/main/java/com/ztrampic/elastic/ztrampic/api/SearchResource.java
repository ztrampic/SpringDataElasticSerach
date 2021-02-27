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
    public SearchResource( UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public Set<User> searchByName(@PathVariable final String name){
        return  userService.findByName(name);
    }

    @GetMapping("/all")
    public Set<User> getAll(){
        return userService.getAll();
    }
}
