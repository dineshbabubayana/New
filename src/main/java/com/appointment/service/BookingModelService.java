package com.appointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.model.BookingModel;
import com.appointment.repo.BookingModelRepo;

@Service
public class BookingModelService {
	private BookingModelRepo bookingModelRepo;
	
	@Autowired
	public BookingModelService(BookingModelRepo bookingModelRepo) {
		super();
		this.bookingModelRepo = bookingModelRepo;
	}
	
	public BookingModel addBooking(BookingModel booking) {
		return bookingModelRepo.save(booking);
	}
	
	public List<BookingModel> findAllBookings(){
		return bookingModelRepo.findAll();
	}
	
	public List<BookingModel> findAllBookingsByDoctor(String doctorDetail){
		return bookingModelRepo.findAllByDoctor(doctorDetail);
	}
	public BookingModel updateBooking(BookingModel booking) {
		return bookingModelRepo.save(booking);
	}
	
	public Optional<BookingModel> findBookingById(String id) {
		return bookingModelRepo.findById(id);
	}
	
	 public void deleteBooking(String id){
	        bookingModelRepo.deleteById(id);
	    }
}
	

