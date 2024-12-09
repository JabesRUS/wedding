package com.javaacademy.wedding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Booking {
    private String id;
    private Integer monthNumber;
    private Integer dayNumber;
    private boolean booked;
}
