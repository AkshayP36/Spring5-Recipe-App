package com.akshaypatil;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top==stack.length){
            //creating a new array and storing all values into it to maximize it's length
            Employee[] newStack = new Employee[2*stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack=newStack;
        }

        stack[top++]=employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top]=null;
        return employee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[top-1];
        return employee;
    }

    public int stackSize(){
        return top;
    }

    public void printStack(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    private boolean isEmpty(){
        return top==0;
    }
}
