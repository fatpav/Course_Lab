package com.codeclan.example.demo.controllers;


import com.codeclan.example.demo.models.Booking;
import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
//            @RequestParam(name = "course", required = false) Course course){
//        if (course != null){
//            return new ResponseEntity<>(bookingRepository.findCustomerByCourse(course), HttpStatus.OK);
//        }
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }
}

