package com.appointment.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appointment.model.BookingModel;

public interface BookingModelRepo extends JpaRepository<BookingModel, String> {
	@Query(value = "select * from bookingModel where doctorDetail = ?", nativeQuery = true)
	List<BookingModel> findAllByDoctor(String id);
}
