import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i,j,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values:");

        try{
            i=scanner.nextInt();
            j=scanner.nextInt();
            result=i/j;
        }catch(NoSuchElementException e){
            throw new NoSuchElementException("Please enter valid numbers");
        }catch(ArithmeticException e){
            throw new ArithmeticException("Can't divide by 0");
        }

        System.out.println("Result = "+result);

    }
}
