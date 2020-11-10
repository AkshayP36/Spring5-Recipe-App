package com.akshaypatil;

import org.w3c.dom.ls.LSOutput;

public class NewClass extends Thread{
    public void run(){
        System.out.println("Start running sleep Sparta Thread:");
        currentThread().setName("Sparta Thread");
        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            System.out.println("Interepted the current running exception = "+currentThread().getName());
        }

        System.out.println("Sleep time over. Let's get back to work Sparta Thread.");
    }
}
