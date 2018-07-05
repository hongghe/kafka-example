package com.hongghe.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The run
 *
 * @author hongghe
 */
@SpringBootApplication
public class KafkaApplication {

    public static void man(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}
