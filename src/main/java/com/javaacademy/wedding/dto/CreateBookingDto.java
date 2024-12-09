package com.javaacademy.wedding.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateBookingDto {
    @JsonProperty("month")
    private Integer monthNumber;
    @JsonProperty("day")
    private Integer dayNumber;
}
