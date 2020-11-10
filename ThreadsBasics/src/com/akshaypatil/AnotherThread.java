package com.akshaypatil;
import static com.akshaypatil.ThreadColor.ANSI_BLUE;
public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Running Thread from Another Thread!");
    }
}
