package com.javaacademy.wedding.dto;

import lombok.Data;

@Data
public class BookingDto {
    private final Integer mountNumber;
    private final Integer dayNumber;
    private final boolean booked;
}
