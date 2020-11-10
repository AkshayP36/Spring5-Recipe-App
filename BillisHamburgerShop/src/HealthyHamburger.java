import java.util.Scanner;

public class HealthyHamburger extends Hamburger{
    Scanner scanner = new Scanner(System.in);
    private String breadRollType="brown bread";
    private boolean meat;
    private double totalCost=0;
    private int topplingCount=6;
    private String toppling;
    private double hamburgerBasePrice = 500;
    private boolean flag=true;

    public HealthyHamburger() {
        super();
    }

    @Override
    public void setBreadRollType(String breadRollType) {

    }

    @Override
    public void setMeat(boolean meat) {
        this.meat=meat;
        if(meat)
            this.totalCost=200;

    }

    public double getHamburgerBasePrice() {
        return hamburgerBasePrice;
    }

    @Override
    public String getBreadRollType() {
        return this.breadRollType;
    }

    @Override
    public boolean isMeat() {
        return super.isMeat();
    }

    @Override
    public void displayAdditions() {
        System.out.println("Please select any 6 out of following additions");
        System.out.println("onion[$20]\tcucumber[$30]\tcheese[$20]\nPepperoni[$20]\tMushrooms[30]\tSausage\nBacon[$40]\tBlack olives[$30]\tGreen peppers[$20]");

        while(this.topplingCount!=0 && this.flag){
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

            if(this.topplingCount>=2) {
                System.out.println("Would you like to add more toppling = true/false");
                flag = scanner.nextBoolean();
            }
        }
    }

    @Override
    public double totalCost() {
        return this.totalCost+this.hamburgerBasePrice;
    }

    @Override
    public double getOnion() {
        return super.getOnion();
    }

    @Override
    public double getCucumber() {
        return super.getCucumber();
    }

    @Override
    public double getCheese() {
        return super.getCheese();
    }

    @Override
    public double getPepperoni() {
        return super.getPepperoni();
    }

    @Override
    public double getSausage() {
        return super.getSausage();
    }

    @Override
    public double getMushrooms() {
        return super.getMushrooms();
    }

    @Override
    public double getBacon() {
        return super.getBacon();
    }

    @Override
    public double getBlackOlives() {
        return super.getBlackOlives();
    }

    @Override
    public double getGreenPeppers() {
        return super.getGreenPeppers();
    }
}
