package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    Get all customers for a given course
    List<Customer> findByBookingsCourseId(Long id);
//    Get all courses for a given customer
    List<Course> findByBookingsCustomerId(Long id);
}
