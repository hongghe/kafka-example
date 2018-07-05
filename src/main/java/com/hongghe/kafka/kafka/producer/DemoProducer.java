package com.hongghe.kafka.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DemoProducer implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(DemoProducer.class);
    
    private final CountDownLatch countDownLatch = new CountDownLatch(3);
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    @Override
    public void run(String... args) throws Exception {
        this.kafkaTemplate.send("test", "1");
        this.kafkaTemplate.send("test", "2");
        this.kafkaTemplate.send("test", "3");
        countDownLatch.await(60, TimeUnit.SECONDS);
        logger.info("All Received");
    }
}
