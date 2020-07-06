package com.consumer.sample;

import feign.RequestLine;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "server-provider")
public interface ReactiveFeignSample {

    @RequestLine("GET  /greetings")
    Mono<String> greeting();
}
