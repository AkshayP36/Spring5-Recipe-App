public class GreatestCommonDivisor {
    /*public static void main(String[] args){
       int first = 12, second =30;
        System.out.println("greatest common divisor of "+first+" & "+second+" = "+getGreatestCommonDivisor(first,second));
    }*/
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second<10)
            return -1;

        // using for loop :
        int counter =1, gcd =1;
        for (int i=1; i <=first; i++){
            if(first%i == 0){
                if(second%i==0){
                    counter = i;
                }
            }

            if(counter>gcd)
                gcd = counter;
        }
        return gcd;

    }
}
