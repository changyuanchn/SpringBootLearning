package org.springboot.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hi(){
        return "Hello World";
    }
}
