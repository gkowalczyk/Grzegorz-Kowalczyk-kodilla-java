package com.example.springwebflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringWebFluxApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void contextLoads1() {

        Flux.just("Grzegorz", "Anna")
                .filter(name -> name.startsWith("G"))
                .subscribe(System.out::println);

        //Mono.just();
    }
}
