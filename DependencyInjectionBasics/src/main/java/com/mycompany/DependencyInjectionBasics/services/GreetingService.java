package com.mycompany.DependencyInjectionBasics.services;

//As per the SOLID principle -> I:Interface segregation controller
//ie defining interfaces as far as possible instead if defining hard code classes
public interface GreetingService {
    String getGreetings();
}
