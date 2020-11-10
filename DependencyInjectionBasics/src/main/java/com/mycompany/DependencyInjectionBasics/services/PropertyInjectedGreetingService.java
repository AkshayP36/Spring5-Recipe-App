package com.mycompany.DependencyInjectionBasics.services;

public class ConstructorGreetingService implements GreetingService{

    @Override
    public String getGreetings() {
        return "Hello World! :) - Constructor";
    }
}
