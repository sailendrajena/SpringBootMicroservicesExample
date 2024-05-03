package com.spring.kafka.springkafkaexample.topic.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic createNewTopic() {
		return TopicBuilder.name("springbootKafkaTopic").build();
	}
}
