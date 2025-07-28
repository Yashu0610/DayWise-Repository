package java8casestudy;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Map;

class Order {
    String customer;
    String category;
    double value;

    Order(String customer, String category, double value) {
        this.customer = customer;
        this.category = category;
        this.value = value;
    }

    public String getCustomer() { return customer; }
    public String getCategory() { return category; }
    public double getValue() { return value; }
}

public class OrderStreamDemo {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Anu", "Electronics", 2000),
            new Order("Ravi", "Books", 500),
            new Order("Anu", "Books", 1500)
        );

        // Filter orders > 1000
        orders.stream()
            .filter(o -> o.getValue() > 1000)
            .forEach(o -> System.out.println(o.customer + " - " + o.category));

        // Group by customer
        Map<String, Long> count = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer, Collectors.counting()));

        System.out.println("Order count per customer: " + count);
    }
}
