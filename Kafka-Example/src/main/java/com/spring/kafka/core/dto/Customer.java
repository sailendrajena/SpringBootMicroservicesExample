package com.spring.kafka.core.dto;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private String email;
    private long contactNo;
}
