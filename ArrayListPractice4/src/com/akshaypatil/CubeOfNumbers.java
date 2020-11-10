package com.akshaypatil;

import java.util.Objects;

public class CubeOfNumbers {

    private int number;
    private double cubeOfNumber;

    public CubeOfNumbers(int number) {
        this.number = number;
        cubeOfNumber();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCubeOfNumber() {
        return cubeOfNumber;
    }

    public double cubeOfNumber() {
        this.cubeOfNumber=(this.number*this.number*this.number);
        return cubeOfNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CubeOfNumbers that = (CubeOfNumbers) o;
        return number == that.number &&
                Double.compare(that.cubeOfNumber, this.cubeOfNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, this.cubeOfNumber);
    }

    @Override
    public String toString() {
        return "CubeOfNumbers{" +
                "number=" + this.number +
                ", cubeOfNumber=" + this.cubeOfNumber +
                '}';
    }
}
