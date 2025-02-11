package com.priyam.movieflix.repository;

import me.jysh.cinematic.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
