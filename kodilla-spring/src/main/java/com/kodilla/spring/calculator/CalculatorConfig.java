package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Calculator calculator(){
        return new Calculator(display());

    }
    @Bean
    public Display display() {
        return new Display();
    }
}
