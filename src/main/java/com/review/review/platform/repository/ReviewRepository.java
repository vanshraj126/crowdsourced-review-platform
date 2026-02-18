package com.review.review.platform.repository;

import com.review.review.platform.entity.reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<reviews, Long> {

    List<reviews> findByBusinessIdAndStatus(Long businessId, String status);
}
