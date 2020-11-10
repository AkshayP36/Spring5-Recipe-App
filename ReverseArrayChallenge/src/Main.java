import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11};
        reverse(myArray);
    }
    public static void reverse(int[] myArray){
        int[] reversedArrayMethod1 = new int[myArray.length];
        int maxLength=myArray.length-1;
        for(int i=0; i<myArray.length; i++){

                reversedArrayMethod1[maxLength]=myArray[i];
                maxLength=maxLength-1;

        }
        System.out.println("Array without reversing = "+ Arrays.toString(myArray));
        System.out.println("Array after reversing = "+Arrays.toString(reversedArrayMethod1));

        //////////////////
        maxLength=myArray.length-1;
        int[] reversedArrayMethod2= new int[myArray.length];
        reversedArrayMethod2=Arrays.copyOf(myArray, myArray.length);
        int halfway= myArray.length/2;
        int temp=0;
        for(int i=0; i<halfway; i++){
            temp = myArray[i];
            myArray[i]=myArray[maxLength-i];
            myArray[maxLength-i]=temp;
        }
        System.out.println("Before reversing Array (Method2) = "+Arrays.toString(reversedArrayMethod2));
        System.out.println("After reversing Array (Method2) = "+Arrays.toString(myArray));
    }
}
