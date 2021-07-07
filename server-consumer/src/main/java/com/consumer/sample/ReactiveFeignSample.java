package com.consumer.sample;

import feign.RequestLine;
import org.springframework.web.bind.annotation.GetMapping;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "server-provider")
public interface ReactiveFeignSample {

    @RequestLine("GET  /geetings")
    @GetMapping(value = "/geetings")
    Mono<String> greeting();
}
