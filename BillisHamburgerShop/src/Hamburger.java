import java.util.Scanner;

public class Hamburger {
    private String breadRollType;
    private boolean meat;
    private double totalCost=0;
    private int topplingCount=4;
    private String toppling;
    private double hamburgerBasePrice = 200;
    private boolean flag=true;

    Scanner scanner = new Scanner(System.in);

    public Hamburger(){
        this.breadRollType=breadRollType;
        this.meat=meat;
        this.totalCost=totalCost;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }
    public void setMeat(boolean meat){
        this.meat=meat;
        if(meat)
        this.totalCost=200;
    }

    public double getBasicHamburgerBasePrice() {
        return hamburgerBasePrice;
    }
    public String getBreadRollType(){
        return this.breadRollType;
    }
    public boolean isMeat(){
        return this.meat;
    }

    public void displayAdditions(){
        System.out.println("Please select any 4 out of following additions");
        System.out.println("onion[$20]\tcucumber[$30]\tcheese[$20]\nPepperoni[$20]\tMushrooms[30]\tSausage\nBacon[$40]\tBlack olives[$30]\tGreen peppers[$20]");

        while(topplingCount!=0 && flag){
            System.out.println("Enter your favourite toppling from the list");
            toppling=scanner.next().toLowerCase();

            switch(toppling){
                case "onion": totalCost=totalCost+ getOnion(); topplingCount--; break;
                case "cucumber": totalCost=totalCost+ getCucumber(); topplingCount--; break;
                case "cheese": totalCost=totalCost+ getCheese(); topplingCount--; break;
                case "pepperoni": totalCost=totalCost+ getPepperoni(); topplingCount--; break;
                case "mushrooms": totalCost=totalCost+ getMushrooms(); topplingCount--; break;
                case "sausage": totalCost=totalCost+ getSausage(); topplingCount--; break;
                case "bacon": totalCost=totalCost+ getBacon();  topplingCount--; break;
                case "black olives": totalCost=totalCost+ getBlackOlives(); topplingCount--; break;
                case "green peppers": totalCost=totalCost+ getGreenPeppers(); topplingCount--; break;
                default: System.out.println("enter valid topplings"); break;
            }

            if(topplingCount>=2) {
                System.out.println("Would you like to add more toppling = true/false");
                flag = scanner.nextBoolean();
            }
        }

    }

    public double totalCost(){
        return this.totalCost+this.hamburgerBasePrice;
    }
    public double getOnion(){
        return 20;
    }
    public double getCucumber(){
        return 15;
    }
    public double getCheese(){
        return 20;
    }
    public double getPepperoni(){
        return 20;
    }
    public double getSausage(){
        return 20;
    }
    public double getMushrooms(){
        return 20;
    }
    public double getBacon(){
        return 20;
    }
    public double getBlackOlives(){
        return 20;
    }
    public double getGreenPeppers(){
        return 20;
    }
}
