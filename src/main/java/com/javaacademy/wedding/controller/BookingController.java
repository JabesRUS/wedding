package com.javaacademy.wedding.controller;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.CreateBookingDto;
import com.javaacademy.wedding.mapper.BookedDaysInMonthDto;
import com.javaacademy.wedding.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
    private final BookingService bookingService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void save(@RequestBody CreateBookingDto createBookingDto) {
        bookingService.save(createBookingDto);
    }

    @GetMapping("/month/{month}")
    public List<BookingDto> getBookingByMount(@PathVariable Integer month) {
        return bookingService.getBookingByMount(month);
    }

    @GetMapping("/month/{month}/free")
    public BookedDaysInMonthDto getFreeDaysInMonth(@PathVariable Integer month) {
        return bookingService.getCountFreeDayByMonth(month);
    }
}
