package com.javaacademy.wedding.storage;

import com.javaacademy.wedding.entity.Booking;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BookingStorage {
    @Getter
    private final Map<String, Booking> bookingStorage = new HashMap<>();


}
