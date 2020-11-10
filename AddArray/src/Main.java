import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int[] myArray = getArray(10);
        System.out.println("myArray[4] = "+myArray[4]);
        //int[] fixedArray = {1,2,5,4,3,6,9,8,7,10};
        System.out.println("fixedArray length = "+myArray.length);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }

    public static int[] getArray(int length){
        int[] myArray = new int[length];
        System.out.println("Enter "+length +" elements : ");

            for (int i = 0; i < length; i++) {
                myArray[i] = scanner.nextInt();
                }
            return myArray;

        }



    public static int[] sortIntegers(int[] fixedArray){
        int temp=0;
        boolean flag=true;
        int[] sortedArray = new int[fixedArray.length];
        while(flag) {
            flag=false;
            for (int i = 0; i < fixedArray.length - 1; i++) {
                if (fixedArray[i] < fixedArray[i + 1]) {
                    sortedArray[i] = fixedArray[i];
                    temp = fixedArray[i];
                    fixedArray[i] = fixedArray[i + 1];
                    fixedArray[i + 1] = temp;
                    flag=true;
                }
            }

        }
        return fixedArray;

    }

    public static void printArray(int[] toPrintArray ){
        for(int i=0; i<toPrintArray.length ; i++){
            System.out.print(toPrintArray[i]+" ");
        }

        System.out.println("\nPrinting array to string = "+ Arrays.toString(toPrintArray));
    }
}
