package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
           
    	Order order1 = new Order(101, "Mobile", 1, 30000);
    	Order order2 = new Order(58, "Book", 4, 2000);
    	Order order3 = new Order(205, "Laptop", 1, 150000);
    	Order order4 = new Order(809, "headset", 1, 1799);
        List<Order> list = new ArrayList<>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
    	return list;
    }
}

