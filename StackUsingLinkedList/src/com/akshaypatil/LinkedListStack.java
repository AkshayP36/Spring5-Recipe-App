package com.akshaypatil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
    private LinkedList<Employee> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<>();
    }

    //defining stack push
    public void push(Employee employee){
        stack.push(employee);
    }

    //defining stack pop
    public Employee pop(){
        return stack.pop();
    }

    //defining stack peek
    public Employee peek(){
        return stack.peek();
    }

    //defining if stack is empty
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    //printing values from the stack
    public void printStack(){
        ListIterator<Employee> iter = stack.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
