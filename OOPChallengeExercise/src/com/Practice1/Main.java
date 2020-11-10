package com.Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Bills com.Practice1.Hamburger");
        Scanner scanner = new Scanner(System.in);
        double totalCost=0,sum=0;
        boolean proceedToCheckout = false;
        while(!proceedToCheckout){
            System.out.println("Enter the name of the type of com.Practice1.Hamburger : \nBasic || Healthy || Delux");
            String productName=scanner.nextLine().toLowerCase();
            switch(productName){
                case "basic":
                    Hamburger hamburger = new Hamburger();
                    totalCost=hamburger.totalCalculations();
                    break;
                case "healthy":
                    HealthyHamburger healthyHamburger= new HealthyHamburger();
                    totalCost=healthyHamburger.totalCalculations();
                    break;
                case "delux":
                    DeluxHamburger deluxHamburger = new DeluxHamburger();
                    totalCost=deluxHamburger.totalCalculations();
                    break;
                default:
                    System.out.println("Please enter valid product");
                    break;
            }

            sum =sum+totalCost;
            System.out.println("Proceed to checkout? = true or false");
            boolean userCheckoutOption = scanner.nextBoolean();
            if(userCheckoutOption)
                proceedToCheckout =true;
            scanner.nextLine();
        }
        //com.Practice1.HealthyHamburger healthyHamburger = new com.Practice1.HealthyHamburger();
       // System.out.println("Healthy com.Practice1.Hamburger details = "+healthyHamburger);

        System.out.println("Please pay amount = "+sum);
        scanner.close();
    }
}
