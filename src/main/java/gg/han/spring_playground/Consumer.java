package gg.han.spring_playground;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "device-config-ingest", groupId = "spring-playground-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}