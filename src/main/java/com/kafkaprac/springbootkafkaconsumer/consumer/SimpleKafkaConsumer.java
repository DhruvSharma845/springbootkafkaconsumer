package com.kafkaprac.springbootkafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleKafkaConsumer {

    @KafkaListener(topics = "simple", groupId = "group_id_simple")
    public void consumeMessageFromTopic(String message) {
        System.out.println("Consumed message: " + message);
    }
}
