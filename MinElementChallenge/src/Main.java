import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("provide the count of total numbers to find min = ");
        int count=scanner.nextInt();
        int[] myArray = readIntegers(count);
        int minValue = findMin(myArray);
        System.out.println("The Min value is = "+minValue);
    }
    public static int[] readIntegers(int count){
        int[] myArray = new int[count];
        for(int i=0; i<count; i++){
            myArray[i]=scanner.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] myArray){
        int temp=myArray[0];
        //int tempp= Integer.MAX_VALUE;

        for(int i=0; i<myArray.length-1; i++){
            if(myArray[i]<temp)
                temp=myArray[i];
        }
        return temp;
    }
}
