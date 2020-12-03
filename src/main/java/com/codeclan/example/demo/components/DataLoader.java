package com.codeclan.example.demo.components;

import com.codeclan.example.demo.models.Booking;
import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.models.Customer;
import com.codeclan.example.demo.repositories.BookingRepository;
import com.codeclan.example.demo.repositories.CourseRepository;
import com.codeclan.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer fred = new Customer("Freddy Fredderson", "Stirling", 28);
        customerRepository.save(fred);

        Customer jed = new Customer("Jebediah Johnson", "Falkirk", 88);
        customerRepository.save(jed);

        Course swim = new Course("Swimming", "Reno", 2);
        courseRepository.save(swim);

        Course cook = new Course("Cooking", "Maryhill", 7);
        courseRepository.save(cook);

        Course read = new Course("Reading", "Pork Bend", 3);
        courseRepository.save(read);

        Course dance = new Course("Dancing", "Manchester", 4);
        courseRepository.save(dance);

        Course telepath = new Course("Telepathy", "Stoke On Trent", 3);
        courseRepository.save(telepath);

//        Booking booking1 = new Booking("23-03-2020", telepath, jed);
//        bookingRepository.save(booking1);
//        Booking booking2 = new Booking("15-01-2019", dance, fred);
//        bookingRepository.save(booking2);
//        Booking booking3 = new Booking("20-05-2019", cook, jed);
//        bookingRepository.save(booking3);
//        Booking booking4 = new Booking("01-06-2020", read, fred);
//        bookingRepository.save(booking4);
//        Booking booking5 = new Booking("09-02-2020", swim, jed);
//        bookingRepository.save(booking5);
    }
}
