package com.Practice1;

import java.util.Scanner;

public class HealthyHamburger extends Hamburger{
    private int additionQuantity=6;
    private String breadRollType="brown bread";
    private boolean doesMeat;
    private double totalPrice;
    AdditionalThings additionalThings = new AdditionalThings(this.additionQuantity);
    BreadRollCalculations breadRollCalculations = new BreadRollCalculations();
    MeatCalculations meatCalculations=new MeatCalculations();
    Scanner scanner = new Scanner(System.in);

    public HealthyHamburger() {
    }

    @Override
    public void setAdditionQuantity(int additionQuantity) {
        super.setAdditionQuantity(additionQuantity);
    }

    @Override
    public String getBreadRollType() {
        return super.getBreadRollType();
    }

    @Override
    public void setBreadRollType(String breadRollType) {
        super.setBreadRollType(breadRollType);
    }

    @Override
    public boolean getdoesMeat() {
        return super.getdoesMeat();
    }

    @Override
    public void setdoesMeat(boolean doesMeat) {
        super.setdoesMeat(doesMeat);
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public double totalCalculations() {
        //return super.totalCalculations();
        System.out.println("Want meat in the com.Practice1.Hamburger? : true or false");
        this.doesMeat=scanner.nextBoolean();
        double meatCost = meatCalculations.meatCalculations(this.doesMeat);
        double breadCost = breadRollCalculations.breadRollCalculations(this.breadRollType);
        //System.out.println("Additional quantity = "+additionQuantity);
        totalPrice=meatCost+breadCost;
        System.out.println("Total cost = "+totalPrice);
        return totalPrice;
    }
}
