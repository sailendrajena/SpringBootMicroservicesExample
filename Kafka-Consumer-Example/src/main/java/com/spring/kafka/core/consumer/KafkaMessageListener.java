package com.spring.kafka.core.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "sb-topic-1", groupId = "sb-consume-131")
    public void consume1(String message){
        log.info("Consumer1 consume the message {}", message);
    }

    @KafkaListener(topics = "sb-topic-1", groupId = "sb-consume-132")
    public void consume2(String message){
        log.info("Consumer2 consume the message {}", message);
    }

    @KafkaListener(topics = "sb-topic-1", groupId = "sb-consume-133")
    public void consume3(String message){
        log.info("Consumer3 consume the message {}", message);
    }

    @KafkaListener(topics = "sb-topic-1", groupId = "sb-consume-134")
    public void consume4(String message){
        log.info("Consumer4 consume the message {}", message);
    }
}
