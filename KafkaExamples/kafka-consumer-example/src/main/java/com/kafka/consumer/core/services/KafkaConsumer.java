package com.kafka.consumer.core.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.core.dto.Customer;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
	@KafkaListener(topics = "sb-topic-2", groupId = "sb-test-group-new")
	public void consume(Customer customer) {
		log.info("Consumer consume message{} ", customer.toString());
	}
}
