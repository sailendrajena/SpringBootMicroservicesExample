package com.spring.eureka.amazon.payment.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/amazon-payment-service/")
public class AmazonPaymentController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("amazon-payment-service/{price}")
	public String invokePaymentService(@PathVariable("price") int price) {
		String url = "http://PAYMENT-SERVICE/payment-provide/paynow/"+price;
		
		return template.getForObject(url, String.class);
	}
}
