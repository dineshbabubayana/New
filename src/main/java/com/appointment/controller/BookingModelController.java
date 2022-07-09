package com.appointment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.model.BookingModel;
import com.appointment.service.BookingModelService;

@RestController

@RequestMapping("/booking")
public class BookingModelController {
	private BookingModelService bookingModelService;

	public BookingModelController(BookingModelService bookingModelService) {
		super();
		this.bookingModelService = bookingModelService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<BookingModel>> getAllBookings(){
		List<BookingModel> booking=bookingModelService.findAllBookings();
		return new ResponseEntity<>(booking, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
    public ResponseEntity<Optional<BookingModel>> getBookingModelById (@PathVariable("id") String id) {
        Optional<BookingModel> booking = bookingModelService.findBookingById(id);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }
	

	@GetMapping("/find/{doctor}")
    public ResponseEntity<List<BookingModel>> getBookingByDoc (@PathVariable("id") String doctor) {
        List<BookingModel> booking = bookingModelService.findAllBookingsByDoctor(doctor);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<BookingModel> addBooking(@RequestBody BookingModel booking) {
        BookingModel newbooking = bookingModelService.addBooking(booking);
        return new ResponseEntity<>(newbooking, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<BookingModel> updateProduct(@RequestBody BookingModel booking) {
    	BookingModel updateproduct = bookingModelService.updateBooking(booking);
        return new ResponseEntity<>(updateproduct, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBookingId(@PathVariable("id") String id) {
       bookingModelService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
