package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class Receiver {

    @KafkaListener(topics = "coffee")
    public void receive(String payload) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(payload);
    }
}