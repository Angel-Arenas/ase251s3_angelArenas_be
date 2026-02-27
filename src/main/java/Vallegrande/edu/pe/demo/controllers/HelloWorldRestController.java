package Vallegrande.edu.pe.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldRestController {

    @GetMapping("/Hello")
    public String Helloworld(){
        return "Hello World";
    }
}

