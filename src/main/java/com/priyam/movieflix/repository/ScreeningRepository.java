package com.priyam.movieflix.repository;

import com.priyam.movieflix.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
