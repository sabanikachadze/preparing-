package org.example;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order(1, "Alice", 100.0, "COMPLETED"),
                new Order(2, "Bob", 75.0, "COMPLETED"),
                new Order(3, "Alice", 50.0, "COMPLETED"),
                new Order(4, "Alice", 200.0, "CANCELLED"),
                new Order(5, "Bob", 25.0, "COMPLETED")
        );

        Map<String, Double>  customersTotalSpending = OrderService.totalSpentByCustomer(orders);
        Optional<Map.Entry<String, Double>> topSpender = OrderService.topSpender(customersTotalSpending);

        System.out.println(customersTotalSpending);
        System.out.println(topSpender.orElseThrow());
    }
}
