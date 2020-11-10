package com.akshaypatil;

import java.util.NoSuchElementException;

public class OSQueue {
    private OSProcess[] queue;
    int startPointer;
    int endPointer;

    public OSQueue(int capacity) {
        this.queue = new OSProcess[capacity];
    }

    public void add(OSProcess process){
        if(endPointer==queue.length){
            OSProcess[] newqueue = new OSProcess[2*queue.length];
            System.arraycopy(queue,0,newqueue,0,queue.length);
            queue = newqueue;
        }

        queue[endPointer]=process;
        endPointer++;
    }

    public OSProcess deque(){
        if(endPointer==0){
            System.out.println("This queue is empty! Please add an element and then try deque method");
        }
        OSProcess processdeque = queue[0];
        for(int i=0;i<endPointer;i++) {
            queue[i]=queue[i+1];
        }

        return processdeque;
    }

    public OSProcess peek(){
        if(endPointer==0){
            throw new NoSuchElementException("Please add element then try deque");
        }

        return queue[0];
    }

    public boolean isqueueEmpty(){
        return queue.length==0;
    }

    public void printqueue(){
        for(int i=0;i<endPointer;i++){
            System.out.println(queue[i]);
        }
    }


}
