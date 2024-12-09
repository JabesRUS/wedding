package com.javaacademy.wedding.mapper;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.CreateBookingDto;
import com.javaacademy.wedding.entity.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {
    public BookingDto convertToDto(Booking booking) {
        return new BookingDto(booking.getMonthNumber(), booking.getDayNumber(), booking.isBooked());
    }

    public Booking convertToEntity(CreateBookingDto createBookingDto) {
        String id = createId(createBookingDto);
        return new Booking(id, createBookingDto.getMonthNumber(), createBookingDto.getDayNumber(), true);
    }

    private String createId(CreateBookingDto createBookingDto) {
        return "%d - %d".formatted(createBookingDto.getMonthNumber(), createBookingDto.getDayNumber());
    }
}
