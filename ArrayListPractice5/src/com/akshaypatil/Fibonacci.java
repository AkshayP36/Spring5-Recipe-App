package com.akshaypatil;

import java.util.Arrays;
import java.util.Objects;

public class Fibonacci {
    private int[] array=new int[3];
    private int length;
    private int[] fibonacciSeries;

    public Fibonacci(int[] array, int length) {
        this.array = array;
        this.length = length;
        fibonacciSeries=new int[this.length];
        setFibonacciSeries();

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getFibonacciSeries() {
        return fibonacciSeries;
    }

    private void setFibonacciSeries() {
        this.fibonacciSeries[0]=this.array[0];
        this.fibonacciSeries[1]=this.array[1];
        this.fibonacciSeries[2]=this.array[2];
        for(int i=3; i<length;i++){
            this.fibonacciSeries[i]=this.fibonacciSeries[i-1]+this.fibonacciSeries[i-2];
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fibonacci fibonacci = (Fibonacci) o;
        return length == fibonacci.length &&
                Arrays.equals(array, fibonacci.array) &&
                Arrays.equals(fibonacciSeries, fibonacci.fibonacciSeries);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(length);
        result = 31 * result + Arrays.hashCode(array);
        result = 31 * result + Arrays.hashCode(fibonacciSeries);
        return result;
    }

    @Override
    public String toString() {
        return "Output= "+Arrays.toString(fibonacciSeries);
    }
}
