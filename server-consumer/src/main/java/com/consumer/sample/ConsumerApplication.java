package com.consumer.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactivefeign.spring.config.EnableReactiveFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableWebFlux
@EnableReactiveFeignClients
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }

}
