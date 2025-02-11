package com.priyam.movieflix.repository;

import com.priyam.movieflix.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
