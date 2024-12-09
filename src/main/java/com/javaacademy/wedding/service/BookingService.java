package com.javaacademy.wedding.service;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.CreateBookingDto;
import com.javaacademy.wedding.mapper.BookedDaysInMonthDto;
import com.javaacademy.wedding.mapper.BookingMapper;
import com.javaacademy.wedding.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public void save(CreateBookingDto createBookingDto) {
        bookingRepository.save(bookingMapper.convertToEntity(createBookingDto));
    }

    public List<BookingDto> getBookingByMount(Integer mount) {
        return bookingRepository.getAll().stream()
                .filter(booking -> booking.getMonthNumber().equals(mount))
                .map(booking -> bookingMapper.convertToDto(booking))
                .toList();
    }

    public BookedDaysInMonthDto getCountFreeDayByMonth(Integer month) {
        var count =  bookingRepository.getAll().stream().filter(booking -> booking.getMonthNumber().equals(month))
                .filter(booking -> booking.isBooked() == true)
                .count();
        return new BookedDaysInMonthDto(count);
    }

}
