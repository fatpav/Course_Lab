package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Booking;
import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
//    Get all customers for a given course
//    List<Customer> findCustomerByCourse(Course course);
}
