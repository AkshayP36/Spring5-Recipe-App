package com.mycompany.DependencyInjectionBasics.controller;

import com.mycompany.DependencyInjectionBasics.services.GreetingService;

//Constructor based controller is the most preferred way of designing controllers

public class ConstructorInjectedController {
    //Code best practice -> use private final 
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){

        return greetingService.getGreetings();
    }
}
