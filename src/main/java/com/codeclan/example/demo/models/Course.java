package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="course")
public class Course {
    @Column(name="course_name")
    private String courseName;
    @Column(name="town")
    private String town;
    @Column(name="star_rating")
    private int starRating;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Booking> bookings;

//    @JsonIgnoreProperties({"courses"})
//    @ManyToMany
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name = "customers_courses",
//            joinColumns = {@JoinColumn(name = "course_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "customer_id", nullable = false, updatable = false)
//            }
//    )
//    private List<Customer> customers;


    public Course(String courseName, String town, int starRating) {
        this.courseName = courseName;
        this.town = town;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
//        this.customers = new ArrayList<Customer>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course(){

    }

//    public void addCustomer(Customer customer){
//        this.customers.add(customer);
//    }
}
