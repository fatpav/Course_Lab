package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
