package com.priyam.movieflix.repository;

import me.jysh.cinematic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
