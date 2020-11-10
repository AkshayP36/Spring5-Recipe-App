package com.mycompany.DependencyInjectionBasics.services;

public class GreetingServiceImplementation implements GreetingService{

    @Override
    public String getGreetings() {
        return "Hello World! :)";
    }
}
