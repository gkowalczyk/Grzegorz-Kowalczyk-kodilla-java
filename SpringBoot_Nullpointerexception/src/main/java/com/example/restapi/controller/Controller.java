package com.example.restapi.controller;

import com.example.restapi.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
public class Controller {

  //@Autowired  // niezalecane
    private final HelloService helloService;

    public Controller(HelloService helloService) {
      this.helloService = helloService;
    }

    @GetMapping
    public String hello() {

        return helloService.hello();
    }

}
