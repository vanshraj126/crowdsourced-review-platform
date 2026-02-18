package com.review.review.platform.controller;

import com.review.review.platform.entity.buisness;
import com.review.review.platform.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/businesses")
public class BusinessController {

    @Autowired
    private BusinessRepository repo;

    @PostMapping
    public buisness add(@RequestBody buisness b) {
        return repo.save(b);
    }

    @GetMapping
    public List<buisness> all() {
        return repo.findAll();
    }
}
