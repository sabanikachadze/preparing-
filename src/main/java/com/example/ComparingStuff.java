package com.example;

import java.util.Comparator;

public class ComparingStuff {

    static void main() {
        Comparator<Product> oldComparator = new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                if (o1 == null && o2 == null) return 0;
                if (o1 == null) return 1;
                if (o2 == null) return -1;

                int result = Double.compare(o1.price(), o2.price());

                if (result == 0) {
                    return o1.name().compareTo(o2.name());
                }

                return result;
            }
        };

        Comparator<Product> modernComparator =
                Comparator.nullsLast(
                        Comparator.comparingDouble(Product::price)
                                .thenComparing(Product::name)
                );
    }

    record Product(String name, double price) {
    }
}
