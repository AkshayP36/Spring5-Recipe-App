package com.akshaypatil;

public class ExtendedThreadClass extends Thread{
    public void run(){
        System.out.println("Calling Thread ExtendedClass");
        currentThread().setName("Turf builders");
        System.out.println("Calling sleep to Thread "+currentThread().getName());
        try{
            Thread.sleep(40000);
        }catch(InterruptedException e){
            System.out.println("Interruption called for Thread "+currentThread().getName());
        }
        System.out.println("Sleep Time over for Thread "+currentThread().getName());
    }
}
