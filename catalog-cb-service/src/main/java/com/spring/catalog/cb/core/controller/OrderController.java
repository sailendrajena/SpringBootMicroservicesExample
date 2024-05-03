package com.spring.catalog.cb.core.controller;

import java.util.List;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.catalog.cb.core.entity.Order;
import com.spring.catalog.cb.core.repository.OrderRepository;



@RestController
@RequestMapping("/api/v1/")
public class OrderController {

	@Autowired
	private OrderRepository repo;
	
	/*
	 * @PostConstruct public void initOrderTable() { repo.saveAll(Stream.of( new
	 * Order(131, "Mobile", "Electronics", "Black", 40000.00), new Order(132, "TV",
	 * "Electronics", "Off White", 60000.00), new Order(133, "Books", "Stationary",
	 * "Blue", 400.00), new Order(134, "Cycle", "Sports", "White & Black",
	 * 10000.00), new Order(135, "Bike", "Ride", "Matt Black", 2061000.00), new
	 * Order(136, "Burger", "Food", "Brown", 150.00), new Order(137, "Cake", "Food",
	 * "Chocolate", 200.00), new Order(138, "Car", "Ride", "Matt Finish Black",
	 * 5050000.00), new Order(139, "Laptop", "Electronics", "Black", 40000.00), new
	 * Order(140, "Dress", "Cloth", "White", 1000.00)).toList()); }
	 */
	
	@PostMapping("order/create")
	public ResponseEntity<Order> createOrder(@RequestBody Order order){
		Order ord = repo.save(order);
		return ResponseEntity.ok(ord);
	}
	
	@GetMapping("orders")
	public List<Order> getOrders(){
		return repo.findAll();
	}
	
	@GetMapping("order/{category}")
	public List<Order> getOrderByCategory(@PathVariable("category") String category){
		return repo.getOrderByCategory(category);
	}
}
