package com.Practice1;

public class BreadRollCalculations{
    private String breadRollType;
    public BreadRollCalculations() {
    }

    public double breadRollCalculations(String breadRollType){
        this.breadRollType=breadRollType.toLowerCase();
        if(this.breadRollType.equals("white bread") || this.breadRollType.equals("white"))
            return 200;
        else if(this.breadRollType.equals("brown bread") || this.breadRollType.equals("brown"))
            return 300;
        else
            return  -1;
    }
}
