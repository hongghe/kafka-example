package com.hongghe.kafka.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class DemoConsumer {

    public static final Logger logger = LoggerFactory.getLogger(DemoConsumer.class);

    private final CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = "test")
    public void listen(ConsumerRecord<?, ?> consumerRecord) throws Exception {
        logger.info(consumerRecord.toString());
        latch.countDown();
    }
}
