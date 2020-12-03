package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {


    @Column(name = "date")
    private String date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnoreProperties({"bookings"})
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @JsonIgnoreProperties({"bookings"})
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    public Booking(String date, Course course, Customer customer) {

        this.date = date;
        this.course = course;
        this.customer = customer;
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
