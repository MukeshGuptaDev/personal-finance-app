package com.personalfinanceapp.dto;

@Data
public class ExpenseDTO {
    private Long id;
    private String category;
    private Double amount;
    private Date date;
    private Long userId;
}