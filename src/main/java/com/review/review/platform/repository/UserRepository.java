package com.review.review.platform.repository;

import com.review.review.platform.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long> {
}
