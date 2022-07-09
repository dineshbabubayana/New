package com.appointment.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingModel {
	@Id
	private String bookingId;
	private String patientDetail; //need to change to UserModel
	private String doctorDetails; //need to change to DoctorModel
	private String hospitalName;
	private Date date;
	private Date time;
	private Boolean bookingStatus;
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getPatientDetail() {
		return patientDetail;
	}
	public void setPatientDetail(String patientDetail) {
		this.patientDetail = patientDetail;
	}
	public String getDoctorDetails() {
		return doctorDetails;
	}
	public void setDoctorDetails(String doctorDetails) {
		this.doctorDetails = doctorDetails;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Boolean getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
