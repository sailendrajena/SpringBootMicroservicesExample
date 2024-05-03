package com.kafka.publisher.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.publisher.core.dto.Customer;
import com.kafka.publisher.core.services.KafkaPublisher;

@RestController
@RequestMapping("/api/pub/v1/")
public class PublisherController {
	
	@Autowired
	private KafkaPublisher publisher;
	
	@GetMapping("published/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable("message") String message){
		try {
			publisher.sendMessageToTopic(message);
			return ResponseEntity.ok("Message published successfully..");
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("published")
	public void sendMessage(@RequestBody Customer customer) {
		publisher.sendMessageToTopic(customer);
	}
}
