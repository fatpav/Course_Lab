package com.codeclan.example.demo;

import com.codeclan.example.demo.models.Booking;
import com.codeclan.example.demo.models.Course;
import com.codeclan.example.demo.models.Customer;
import com.codeclan.example.demo.repositories.BookingRepository;
import com.codeclan.example.demo.repositories.CourseRepository;
import com.codeclan.example.demo.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class ExcitingCourseBookerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void databaseHasCustomers(){
		List<Customer> foundCustomer = customerRepository.findAll();
		assertEquals(2, foundCustomer.size());
	}

	@Test
	public void databaseHasBookings(){
		List<Booking> foundBooking = bookingRepository.findAll();
		assertEquals(5, foundBooking.size());
	}

	@Test
	public void databaseHasCourses(){
		List<Course> foundCourse = courseRepository.findAll();
		assertEquals(5, foundCourse.size());
	}

}
