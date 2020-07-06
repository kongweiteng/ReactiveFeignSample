package com.consumer.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ConsumerController {

    @Autowired
    ReactiveFeignSample feignSample;

    @GetMapping("/greetingReactive")
    public Mono<String> greetingReactive() {
        return feignSample.greeting().map(s -> "reactive feign! : " + s);
    }

}
