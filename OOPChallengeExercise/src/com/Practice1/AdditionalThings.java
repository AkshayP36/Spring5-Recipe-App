package com.Practice1;

public class AdditionalThings{
    private int maxQuantity;
    private String additionalThings;
    private double productPrice;
    private int counter=0;
    public AdditionalThings(int maxQuantity) {         this.maxQuantity = maxQuantity;    }

    public double getProductPrice(){ //String additionalThings
        additionalThings = additionalThings.toLowerCase();
        while(counter<this.maxQuantity)
        switch(additionalThings){
            case "lettuce": return 20;
            case "tomato": return 30;
            case "carrot": return 40;
            case "onion": return 50;
            case "chicken": return 200;
            case "mutton balls": return 250;
            case "chips": return 75;
            case "drinks": return 110;
            default : return -1;
        }
    }
}
