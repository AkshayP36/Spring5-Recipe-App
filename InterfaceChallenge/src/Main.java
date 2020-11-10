import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<String> traveler = new ArrayList<String>();
        traveler = {"27", "123456789", "Love Travel"};

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void provideTravelerDetails(ArrayList<String> traveler){
        PassangerName regularPassanger = new PassangerName(traveler.get(0), traveler.get(1), traveler.get(2));
        regularPassanger.setAge(25);
    }

    public static ArrayList<String> getTravelerDetails(){

    }
}
