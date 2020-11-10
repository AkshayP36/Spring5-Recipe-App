package com.akshaypatil;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Employee> stack;

    public LinkedListStack() {
        stack=new LinkedList<Employee>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
      return    stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        Iterator<Employee> iterator = stack.listIterator()
    }
}
