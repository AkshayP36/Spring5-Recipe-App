package com.mycompany.DependencyInjectionBasics.controller;

import com.mycompany.DependencyInjectionBasics.services.GreetingService;

//setters based controller defination is the debatable way of defining of a controller

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){

        return greetingService.getGreetings();
    }
}
