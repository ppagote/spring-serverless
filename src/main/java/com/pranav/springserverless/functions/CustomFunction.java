package com.pranav.springserverless.functions;

import reactor.core.publisher.Flux;

import java.util.function.Function;

public class CustomFunction implements Function<Flux<String>, Flux<String>> {
    @Override
    public Flux<String> apply(Flux<String> flux) {
        return flux.map(foo -> "functional bean");
    }

}
