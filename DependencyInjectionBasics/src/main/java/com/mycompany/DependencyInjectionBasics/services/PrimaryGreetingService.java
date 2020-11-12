package com.mycompany.DependencyInjectionBasics.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String getGreetings() {
        return "Hello World - Primary Bean! :)";
    }
}
