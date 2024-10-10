package org.example.consumer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @RabbitListener(queues = "queueName")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}