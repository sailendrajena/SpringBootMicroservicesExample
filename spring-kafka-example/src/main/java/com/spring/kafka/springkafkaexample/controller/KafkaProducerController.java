package com.spring.kafka.springkafkaexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.springkafkaexample.entity.User;
import com.spring.kafka.springkafkaexample.producer.services.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

	private KafkaProducer producer;

	public KafkaProducerController(KafkaProducer producer) {
		this.producer = producer;
	}

	@GetMapping("/publish")
	public ResponseEntity<String> published(@RequestParam("message") String message){
		producer.sendMessage(message);
		return ResponseEntity.ok("Message sent to Kafka Topic");
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		
		producer.sendUserMessage(user);
		
		return ResponseEntity.ok("Message Sent to Kafka Topic");
	}
	
}