package com.codeclan.example.demo.controllers;


import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(
            @RequestParam(name = "starRating", required = false) Integer starRating, @RequestParam (name = "id",
            required = false) Long id){
        if (starRating != null) {
            return new ResponseEntity<>(courseRepository.findCourseByStarRating(starRating), HttpStatus.OK);
        }
        if (id != null) {
            return new ResponseEntity<>(courseRepository.findByBookingsCustomerId(id), HttpStatus.OK);
        }

        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }



}
