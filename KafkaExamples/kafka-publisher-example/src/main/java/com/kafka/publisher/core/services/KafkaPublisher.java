package com.kafka.publisher.core.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.kafka.publisher.core.dto.Customer;

@Service
public class KafkaPublisher {

	@Autowired
	private KafkaTemplate<String, Object> template;

	public void sendMessageToTopic(String message) {
		CompletableFuture<SendResult<String, Object>> future = template.send("sb-topic-2", message);

		future.whenComplete((result, ex) -> {
			System.out.println("Partitions: " + result.getRecordMetadata().partition() + " and topics: "
					+ result.getRecordMetadata().topic() + " and Headers: " + result.getProducerRecord().headers());
			if (ex == null) {
				System.out.println(
						"Send Mesage: [" + message + "] with offset: [" + result.getRecordMetadata().offset() + "]");
			} else {
				System.out.println("Unable to send message: [" + message + "] due to: [" + ex.getMessage() + "]");
			}
		});
	}
	
	public void sendMessageToTopic(Customer customer) {
		try {
			CompletableFuture<SendResult<String, Object>> future = template.send("sb-topic-2", customer);

			future.whenComplete((result, ex) -> {
				System.out.println("Partitions: " + result.getRecordMetadata().partition() + " and topics: "
						+ result.getRecordMetadata().topic() + " and Headers: " + result.getProducerRecord().headers());
				if (ex == null) {
					System.out.println(
							"Send Mesage: [" + customer + "] with offset: [" + result.getRecordMetadata().offset() + "]");
				} else {
					System.out.println("Unable to send message: [" + customer + "] due to: [" + ex.getMessage() + "]");
				}
			});

		}catch(Exception ex) {
			System.out.println("Error in Publisher sendMessageToTopic"+ex.getMessage());
		}
	}
}