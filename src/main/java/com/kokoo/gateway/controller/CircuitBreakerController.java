package com.kokoo.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class CircuitBreakerController {

    @RequestMapping(value = "/fallback")
    public Mono<Boolean> fallback(ServerWebExchange exchange) {
        log.info("circuit breaker");

        return Mono.just(true);
    }
}
