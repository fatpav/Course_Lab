package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
