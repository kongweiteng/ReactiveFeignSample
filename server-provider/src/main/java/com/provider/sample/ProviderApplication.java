package com.provider.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;


@SpringBootApplication
@EnableDiscoveryClient
@EnableWebFlux
@RestController
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }

    @GetMapping("/geetings")
    public String greetings() {
        return "hello from Server Provider";
    }
}
