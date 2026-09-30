package com.example;

public record Order(int orderId,
                    String customerName,
                    double amount,
                    String status) {}
