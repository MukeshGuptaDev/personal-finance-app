package com.personalfinanceapp.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ExpenseDTO {
    private Long id;
    private String category;
    private Double amount;
    private Date date;
    private Long userId;
}