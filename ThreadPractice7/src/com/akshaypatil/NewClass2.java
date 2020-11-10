package com.akshaypatil;

public class NewClass2 extends Thread{
    public void run(){
        System.out.println("Start running sleep Rangers Thread:");
        currentThread().setName("Rangers Thread");
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Interepted the current running exception = "+currentThread().getName());
        }

        System.out.println("Sleep time over. Let's get back to work Rangers Thread.");
    }
}
