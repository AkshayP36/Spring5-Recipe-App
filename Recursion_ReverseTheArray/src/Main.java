public class Main {
    public static void main(String[] args){
        int[] myArray = {2,4,5,7,8,10,6,3,12};
        callReverse(myArray);
        //System.out.println(myArray.toString());
    }
    public static void callReverse(int[] myArray) {

        if (myArray.length == 0)
            return;
        int[] reversedArray = new int[myArray.length - 1];
        for (int i = 0; i < myArray.length - 1; i++){
            reversedArray[i] = myArray[i + 1];
        callReverse(reversedArray);
    }
        System.out.print(reversedArray[0]);

    }
}
