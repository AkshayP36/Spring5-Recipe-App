package com.mycompany.DependencyInjectionBasics.controller;

import com.mycompany.DependencyInjectionBasics.services.GreetingService;
import org.springframework.stereotype.Controller;

//creating bean i.e. creating controller ie. adding annotations to the class as Controller

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String HelloWorld(){
        return greetingService.getGreetings();
    }
}
