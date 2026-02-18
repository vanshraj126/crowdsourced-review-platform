package com.review.review.platform.controller;

import com.review.review.platform.entity.reviews;
import com.review.review.platform.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository repo;

    @PostMapping
    public reviews submit(@RequestBody reviews r) {
        r.setStatus("PENDING");
        return repo.save(r);
    }

    @PutMapping("/approve/{id}")
    public reviews approve(@PathVariable Long id) {
        reviews r = repo.findById(id).orElseThrow();
        r.setStatus("APPROVED");
        return repo.save(r);
    }

    @GetMapping("/business/{id}")
    public List<reviews> approved(@PathVariable Long id) {
        return repo.findByBusinessIdAndStatus(id, "APPROVED");
    }
}
