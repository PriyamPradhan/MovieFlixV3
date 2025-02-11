package com.priyam.movieflix.repository;

import me.jysh.cinematic.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
