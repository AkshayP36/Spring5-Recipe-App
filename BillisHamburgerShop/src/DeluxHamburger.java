import java.util.Scanner;

public class DeluxHamburger extends Hamburger{
    Scanner scanner = new Scanner(System.in);
    private String breadRollType;
    private boolean meat;
    private double totalCost=0;
    private int topplingCount=0;
    private String toppling;
    private double hamburgerBasePrice = 700;
    private boolean flag=true;

    public DeluxHamburger() {
        super();
    }

    @Override
    public void setBreadRollType(String breadRollType) {
        super.setBreadRollType(breadRollType);
    }

    @Override
    public void setMeat(boolean meat) {
        this.meat=meat;
        if(meat)
            this.totalCost=200;
    }


    public double gethamburgerBasePrice() {
        return hamburgerBasePrice;
    }

    @Override
    public String getBreadRollType() {
        return breadRollType;
    }

    @Override
    public boolean isMeat() {
        return meat;
    }

    @Override
    public void displayAdditions() {

        System.out.println("Two additions added to the Delux Hamburger");
        System.out.println("Chips &\tCoke");
    }

    @Override
    public double totalCost() {
        return this.totalCost+hamburgerBasePrice;
    }

}
