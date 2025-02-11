package com.priyam.movieflix.repository;

import com.priyam.movieflix.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
