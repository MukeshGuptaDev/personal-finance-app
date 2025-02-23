package com.personalfinanceapp.model;

import jakarta.persistence.*;

import java.util.Date;

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private Double amount;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
