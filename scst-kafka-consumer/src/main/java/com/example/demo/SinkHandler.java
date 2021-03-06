package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Consumer;

@Slf4j
@Component
public class SinkHandler {

    @Bean
    Consumer<List<CoffeeDTO>> functionInput(){
        return r -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r.forEach(coffeeDTO -> log.info(coffeeDTO.getName()));
            log.info("Batch Message Size : " + r.size());
        };
    }

}
