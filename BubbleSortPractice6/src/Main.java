public class Main {

    public static void main(String[] args) {
        int[] array = {5,1,4,7,8,10,-89,-45};
        int temp;

        for(int unsortedIndex = array.length-1; unsortedIndex>0; unsortedIndex--){
            for(int sortedIndex = 0; sortedIndex<unsortedIndex ; sortedIndex++){
                if(array[sortedIndex] < array[sortedIndex+1]){
                    temp = array[sortedIndex];
                    array[sortedIndex] = array[sortedIndex+1];
                    array[sortedIndex+1] = temp;
                }

            }
        }

        for(int i =0; i<array.length; i++)
            System.out.print(array[i]+" ");

    }
}
