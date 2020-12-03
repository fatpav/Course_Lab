package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
