package com.spring.school.external.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestSpringBootController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World....";
    }

    @GetMapping("/callClientHello")
    public String getHelloClient() {
        String url = "https://restcountries.eu/rest/v2/all";
        RestTemplate template = new RestTemplate();
        return template.getForObject(url, String.class);
    }
}

