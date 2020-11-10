package com.akshaypatil;

public class AnotherExtendedClass extends Thread{
    public void run(){
        System.out.println("Running another class");
        currentThread().setName("This is Sparta Class");
        System.out.println("Calling Thread get name from Extended class = "+currentThread().getName());
    }
}
