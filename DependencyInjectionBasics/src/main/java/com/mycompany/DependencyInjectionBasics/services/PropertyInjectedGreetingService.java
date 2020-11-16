package com.mycompany.DependencyInjectionBasics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Autowired
    @Override
    public String getGreetings() {
        return "Hello World! :) - Property";
    }
}