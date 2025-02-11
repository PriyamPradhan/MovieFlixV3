package com.priyam.movieflix.repository;

import com.priyam.movieflix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
