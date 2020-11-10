import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Groceries groceries=new Groceries();
    public static void main(String[] args){
    boolean quit = false;
    int choie =0;
    printInstruction();
    while(!quit){
        System.out.println("Enter your choice");
        choice =scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 0:
                printInstruction();
                break;
            case 1:
                groceries.printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchForItem();
                break;
            case 6:
                quit = true;
                break;
        }
    }

    }
}
