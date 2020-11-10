package com.Practice1;

public class MeatCalculations {
    private boolean doesMeat;
    public MeatCalculations(){

    }

    public double meatCalculations(boolean doesMeat){
        this.doesMeat=doesMeat;
        if(this.doesMeat)
            return 200;
        else
            return 0;
    }
}
