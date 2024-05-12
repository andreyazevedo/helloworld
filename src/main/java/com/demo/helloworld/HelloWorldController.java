package com.demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/produto")
    public String helloWorld() {
        return "Hello World, Doctor!";
    }
}
