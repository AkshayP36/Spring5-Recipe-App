public class PerfectNumber {
    /*public static void main(String[] args){
        int number = 6;
        boolean out = isPerfectNumber(number);
        System.out.println("is number perfect ? = "+out);
    }*/
    public static boolean isPerfectNumber(int number){
        if (number < 1)
            return false;

        System.out.println("hi");
        int counter=1, sum=0;
        while(counter<number){


            if(number%counter==0){
                sum = sum+counter;
                
            }
            counter++;
        }

        if(sum==number)
            return true;
        else return false;
    }
}
