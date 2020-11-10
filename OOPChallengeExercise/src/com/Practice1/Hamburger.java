package com.Practice1;

import java.util.Scanner;

public class Hamburger {
    private int additionQuantity;
    private String breadRollType;
    private boolean doesMeat;
    private double totalPrice;
    AdditionalThings additionalThings = new AdditionalThings(this.additionQuantity);
    BreadRollCalculations breadRollCalculations = new BreadRollCalculations();
    MeatCalculations meatCalculations=new MeatCalculations();
    Scanner scanner = new Scanner(System.in);
    
    public Hamburger() {

    }

    public void setAdditionQuantity(int additionQuantity) {
        additionQuantity=4;
        this.additionQuantity = additionQuantity;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public boolean getdoesMeat() {
        return doesMeat;
    }

    public void setdoesMeat(boolean doesMeat) {
        this.doesMeat = doesMeat;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

   public double totalCalculations(){
        System.out.println("Enter bread roll type: 1. White Bread 2. Brown Bread");
        this.breadRollType=  scanner.nextLine().toLowerCase();
        System.out.println("Want meat in the com.Practice1.Hamburger? : true or false");
        this.doesMeat=scanner.nextBoolean();
        double meatCost = meatCalculations.meatCalculations(this.doesMeat);
        double breadCost = breadRollCalculations.breadRollCalculations(this.breadRollType);
        //System.out.println("Additional quantity = "+additionQuantity);
        totalPrice=meatCost+breadCost;
       System.out.println("meatCost = "+meatCost);
       System.out.println("breadCost = "+breadCost);
        System.out.println("Total cost = "+totalPrice);
        return totalPrice;
    }


}