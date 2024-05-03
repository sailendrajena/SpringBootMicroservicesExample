package com.spring.kafka.core.controller;

import com.spring.kafka.core.services.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/v1/")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;

    @GetMapping("published/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {
        try {
            for(int i=0; i<10000; i++){
                publisher.sendMessageToTopic(message+" "+i);
            }

            return ResponseEntity.ok("Message Published Successfully.....");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
