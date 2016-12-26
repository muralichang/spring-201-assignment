package com.hotel.booking.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hotel.booking.model.Booking;

public class BookingDateRangeValidator implements ConstraintValidator<BookingDateRange, Booking> {

    public void initialize(BookingDateRange bookingDateRange) {
    }

    public boolean isValid(Booking booking, ConstraintValidatorContext context) {
	if ((booking.getCheckinDate() != null) && (booking.getCheckoutDate() != null)
		&& booking.getCheckoutDate().before(booking.getCheckinDate())) {
	    return false;
	}
	return true;
    }

}
