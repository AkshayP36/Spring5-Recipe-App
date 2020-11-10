package com.akshaypatil;

public class QueueArray {
    private Employee[] queue;
    private int frontPointer;
    private int backPointer;

    public QueueArray(int capacity) {
        this.queue = new Employee[capacity];
    }

    //defining adding elements to the queue
    public void add(Employee employee){
        if(backPointer==queue.length){
            Employee[] newqueue = new Employee[queue.length*2];
            System.arraycopy(queue,0,newqueue,0,queue.length);
            queue = newqueue;
        }
        queue[backPointer] = employee;
        backPointer++;

    }

    //defining dequeue method for the queue
    public Employee dequeue(){
        if(backPointer<0){
            System.out.println("Queue is empty!");
            return null;
        }

        Employee employeeAtFront = queue[0];
        for(int i=0;i<backPointer;i++){
            queue[i]=queue[i+1];
        }
        backPointer--;

        return employeeAtFront;
    }



    //defining peek method for the queue
    public Employee peekqueue(){
        if(backPointer<0){
            System.out.println("Queue is empty!");
            return null;
        }

        return queue[0];
    }


    //defining method for checking if queue is empty
    public boolean isEmpty(){
        return queue.length==0;
    }


    //defining method to print the elements of an queue
    public void printqueue(){
        for(int i=0;i<backPointer;i++){
            System.out.println(queue[i]);
        }
    }
    public int size(){
        return queue.length;
    }
}
