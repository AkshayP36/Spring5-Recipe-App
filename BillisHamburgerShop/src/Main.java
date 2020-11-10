import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Hamburger hamburger=new Hamburger();
        System.out.println("Please provide bread roll type = ");
        hamburger.setBreadRollType(scanner.nextLine());
        System.out.println("Please suggest to add meat or not = true/false");
        hamburger.setMeat(scanner.nextBoolean());        ;
        hamburger.displayAdditions();
        System.out.println("Your order details are : \nBread roll = "+hamburger.getBreadRollType()+"\tDoes contain meat = "+hamburger.isMeat());
        System.out.println("Basic Hamburger price = "+hamburger.getBasicHamburgerBasePrice());
        System.out.println("Total price = "+hamburger.totalCost());
        scanner.nextLine();
        System.out.println("**********************************************************");
        // Healthy Hamburger
        HealthyHamburger healthyHamburger=new HealthyHamburger();
        System.out.println("Please provide bread roll type = ");
        healthyHamburger.setBreadRollType(scanner.nextLine());
        System.out.println("Please suggest to add meat or not = true/false");
        healthyHamburger.setMeat(scanner.nextBoolean());        ;
        healthyHamburger.displayAdditions();
        System.out.println("Your order details are : \nBread roll = "+healthyHamburger.getBreadRollType()+"\tDoes contain meat = "+healthyHamburger.isMeat());
        System.out.println("Basic healthyHamburger price = "+healthyHamburger.getHamburgerBasePrice());
        System.out.println("Total price = "+healthyHamburger.totalCost());
        scanner.nextLine();
        System.out.println("**********************************************************");
        //Delux Hamburger
        DeluxHamburger deluxHamburger=new DeluxHamburger();
        System.out.println("Please provide bread roll type = ");
        deluxHamburger.setBreadRollType(scanner.nextLine());
        System.out.println("Please suggest to add meat or not = true/false");
        deluxHamburger.setMeat(scanner.nextBoolean());        ;
        deluxHamburger.displayAdditions();
        System.out.println("Your order details are : \nBread roll = "+deluxHamburger.getBreadRollType()+"\tDoes contain meat = "+deluxHamburger.isMeat());
        System.out.println("Basic deluxHamburger price = "+deluxHamburger.gethamburgerBasePrice());
        System.out.println("Total price = "+deluxHamburger.totalCost());
        
    }
}
