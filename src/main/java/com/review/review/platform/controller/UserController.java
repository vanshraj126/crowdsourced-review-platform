package com.review.review.platform.controller;

import com.review.review.platform.entity.user;
import com.review.review.platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping
    public user addUser(@RequestBody user user) {
        return repo.save(user);
    }

    @GetMapping
    public List<user> getAll() {
        return repo.findAll();
    }
}
