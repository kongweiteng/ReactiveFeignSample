package com.consumer.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ConsumerController {


    private final ReactiveFeignSample feignSample;

    @GetMapping("/greetingReactive")
    public Mono<String> greetingReactive() {
        return feignSample.greeting().map(s -> "reactive feign! : " + s);
    }

}
