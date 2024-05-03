package com.spring.external.api.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientServices {
	private final WebClient webclient;

	public WebClientServices(WebClient.Builder webClientBuilder) {
		this.webclient = webClientBuilder.baseUrl("https://restcountries.eu/rest/v2/all").build();
	}
	
	
}
