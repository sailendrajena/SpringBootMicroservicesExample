package com.spring.kafka.springkafkaexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring.kafka.springkafkaexample.constants.AppConstants;
import com.spring.kafka.springkafkaexample.entity.User;

@Service
public class KafkaConsumer {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
	public void consume(String message) {
		logger.info(String.format("Message revieved -->%s", message));
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
	public void consume(User data) {
		logger.info("Message Recieved-> %s", data.toString());
	}
}
