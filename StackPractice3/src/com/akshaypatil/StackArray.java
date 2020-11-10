package com.akshaypatil;

import java.util.EmptyStackException;

public class StackArray {
    private Employee[] stack;
    private int top;

    public StackArray(int capacity){
        stack = new Employee[capacity];
    }
    public void push(Employee employee){
        if(top==stack.length){
            //increasing the length of the array by creating new arraya and storing values
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
        Employee employee=stack[--top];
        stack[top]=null;
        return employee;
    }
    public Employee peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return stack[top-1];
    }
    public int size(){
        return top;
    }

    private boolean isEmpty(){
        return top==0;
    }
    public void printStack(){
        for(int i=stack.length-1; i>=0; i--)
            System.out.println(stack[i]);
    }
}
