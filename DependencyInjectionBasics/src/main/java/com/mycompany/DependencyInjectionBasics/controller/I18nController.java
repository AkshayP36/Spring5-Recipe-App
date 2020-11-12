package com.mycompany.DependencyInjectionBasics.controller;

import com.mycompany.DependencyInjectionBasics.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String HelloWorld(){
       return greetingService.getGreetings();
    }
}
