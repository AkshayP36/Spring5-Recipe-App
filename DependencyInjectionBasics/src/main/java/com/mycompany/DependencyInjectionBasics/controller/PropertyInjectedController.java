package com.mycompany.DependencyInjectionBasics.controller;

import com.mycompany.DependencyInjectionBasics.services.GreetingService;

//property based controller is the least preferred way of defining controllers

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreetings(){

        return greetingService.getGreetings();
    }
}
