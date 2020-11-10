public class Main {
    public static void main(String[] args){
        //first method
        int[] myIntArray = new int[10];
        myIntArray[5]=50;
        System.out.println("myIntArray[5] = "+myIntArray[5]);

        //second method
        int[] mySecondArray = {1,2,3,4,5,6,7,8,9,10};
        for(int u=0; u<mySecondArray.length ; u++){
            System.out.println("mySecondArray "+u+" element = "+mySecondArray[u]);
        }

        //third method
        double[] myThirdArray = new double[15];
        for(int t=0; t<myThirdArray.length ; t++){
            myThirdArray[t] = t * Math.PI;
        }
        printArrayValues(myThirdArray);
    }

    public static void printArrayValues(double[] array){
        for(int y=0; y<array.length; y++){
            System.out.println("Array element "+y+" = "+array[y]);
        }
    }
}
