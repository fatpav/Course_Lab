package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
//    Get all courses with a given rating
    List<Course> findCourseByStarRating (int starRating);
    List<Course> findByBookingsCustomerId(Long id);
}
