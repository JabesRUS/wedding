package com.javaacademy.wedding.repository;

import com.javaacademy.wedding.entity.Booking;
import com.javaacademy.wedding.storage.BookingStorage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class BookingRepository {
    private final BookingStorage bookingStorage;

    public void save(Booking booking) {
        String id = booking.getId();
        bookingStorage.getBookingStorage().put(id, booking);
        log.info("Объект сохранен {}", booking.toString());
    }

    public List<Booking> getAll() {
        return bookingStorage.getBookingStorage().values().stream().toList();
    }

}
