package com.akshaypatil;

public class AnotherClass extends Thread{

    public void run(){
        System.out.println("\n\n");
        for(int i=0; i<50; i++)
            System.out.print(i+" ");
    }
}
