package com.capg.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="bookingid")
private int bookingId;
//@OneToOne
//@JoinColumn(name="showId")
@Column(name="showid")
private int showId;
//@OneToOne
//@JoinColumn(name="userId")
@Column(name="userid")
private int userId;
@Column(name="bookingdate")
@Temporal(TemporalType.DATE)
private Date bookedDate;
@Column(name="showdate")
@Temporal(TemporalType.DATE)
private Date showDate;

public Booking() {
	
}

public Booking(int bookingId, int showId, int userId, Date bookedDate, Date showDate) {
	this.bookingId = bookingId;
	this.showId = showId;
	this.userId = userId;
	this.bookedDate = bookedDate;
	this.showDate = showDate;
}

public int getBookingId() {
	return bookingId;
}

public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}

public int getShowId() {
	return showId;
}

public void setShowId(int showId) {
	this.showId = showId;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public Date getBookedDate() {
	return bookedDate;
}

public void setBookedDate(Date bookedDate) {
	this.bookedDate = bookedDate;
}

public Date getShowDate() {
	return showDate;
}

public void setShowDate(Date showDate) {
	this.showDate = showDate;
}

@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", showId=" + showId + ", userId=" + userId + ", bookedDate="
			+ bookedDate + ", showDate=" + showDate + "]";
}

}
