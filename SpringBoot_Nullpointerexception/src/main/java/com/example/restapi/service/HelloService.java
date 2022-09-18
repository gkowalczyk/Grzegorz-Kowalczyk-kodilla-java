package com.example.restapi.service;

import org.springframework.stereotype.Service;

@Service
//@Scope(value = "singleton")
public class HelloService {

   public String hello() {
       return "hello world from service";

    }

}
