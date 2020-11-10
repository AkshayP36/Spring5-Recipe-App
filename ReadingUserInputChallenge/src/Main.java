import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter=0, sum=0, number=0;

        while(true){
            int order = counter+1;
            System.out.println("Enter number #"+order+":");
            boolean isValid = scanner.hasNextInt();

            if(isValid){
                number = scanner.nextInt();
                sum=sum+number;
                counter++;
                if(counter==10)
                    break;
            }
            else
                System.out.println("Please enter valid number");

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Sum of all numbers = "+sum);
    }
}