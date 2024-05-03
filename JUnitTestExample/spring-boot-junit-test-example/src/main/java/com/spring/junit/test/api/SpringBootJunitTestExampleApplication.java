package com.spring.junit.test.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootJunitTestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJunitTestExampleApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
