package com.example;

import java.util.*;
import java.util.stream.Collectors;

public final class OrderService {

    public static Map<String, Double> totalSpentByCustomer(List<Order> orders) {

        return orders.stream()
                .filter(order -> "COMPLETED".equals(order.status()))
                .collect(Collectors.groupingBy(
                        Order::customerName,
                        Collectors.summingDouble(Order::amount)
                ));
    }

    public static Optional<Map.Entry<String, Double>> topSpender(Map<String, Double> totals) {

        if (totals.isEmpty()) {
            return Optional.empty();
        }

        Double amount = 0.0;
        Map.Entry<String, Double> topSpender = null;

        for (Map.Entry<String, Double> entry : totals.entrySet()) {
            if (entry.getValue() >= amount) {
                amount = entry.getValue();
                topSpender = entry;
            }
        }

        return Optional.of(topSpender);
    }
}
