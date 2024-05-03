package com.spring.kafka.springkafkaexample.producer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.spring.kafka.springkafkaexample.constants.AppConstants;
import com.spring.kafka.springkafkaexample.entity.User;

@Service
public class KafkaProducer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private KafkaTemplate<String, User> kafkaUserTemplate;

	public void sendMessage(String message) {
		logger.info(String.format("Message Sent--> %s", message));
		kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
	}

	public void sendUserMessage(User data) {
		logger.info("Message Sent-> %s", data.toString());

		Message<User> message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, AppConstants.TOPIC_NAME)
				.build();
		
		kafkaUserTemplate.send(message);
	}
}
