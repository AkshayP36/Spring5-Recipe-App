package com.akshaypatil;

public class ImplementedThreadClass implements Runnable{
    public void run(){
        System.out.println("Calling Thread ImplementedClass");

        System.out.println("Calling sleep to Thread Eastern Express");
        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            System.out.println("Interruption called for Thread Eastern Express");
        }
        System.out.println("Sleep Time over for Thread Eastern Express");
    }
}
