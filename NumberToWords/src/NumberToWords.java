public class NumberToWords {
    /*public static void main(String[] args){
        int number = 0;
        int digitCount= getDigitCount(number);
        System.out.println("digitCount = "+digitCount);
        numberToWords(number);

    }*/
    public static void numberToWords(int number){
        if (number<0)
            System.out.println("Invalid Value");
        else if(number == 0)
            System.out.println("Zero");
        else {

            int numberCountBeforeReverse = getDigitCount(number);
            number = reverse(number);
            int numberCountAfterReverse = getDigitCount(number);
            int ifDifferenceBetweenCounters = numberCountBeforeReverse - numberCountAfterReverse;


            int unitPlace = 0;
            while (number != 0) {
                unitPlace = number % 10;
                number = number / 10;
                switch (unitPlace) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                        break;
                }
            }

            while (ifDifferenceBetweenCounters != 0) {
                System.out.println("Zero");
                ifDifferenceBetweenCounters = ifDifferenceBetweenCounters - 1;
            }
        }

    }
    public static int reverse(int number){
        int unitPlace=0, reverseNumber=0 ;
        while(number!=0){
            unitPlace=number%10;
            number=number/10;
            reverseNumber = reverseNumber * 10 + unitPlace;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number <0)
            return -1;
        else if (number ==0)
            return 1;

        int digitCount=0, unitPlace=0;
        while(number!=0){
            unitPlace=number%10;
            number=number/10;
            digitCount +=1;
        }
        return digitCount;
    }
}
