import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Object[] haystack = new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        String myString = findNeedle(haystack);
        System.out.println(myString);
        System.out.println("--------");

        haystack = new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        myString = findNeedle(haystack);
        System.out.println(myString);

        System.out.println("--------");

        haystack = new Object[]{"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        myString = findNeedle(haystack);
        System.out.println(myString);

        System.out.println("--------");
        haystack =new Object[]  {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        myString = findNeedle(haystack);
        System.out.println(myString);
    }
    public static String findNeedle(Object[] haystack){

        /*for(int i=0; i<haystack.length; i++){
            try {
                if (haystack[i].equals("needle"))
                    return "found the needle at position " + i;

            }
            catch(NullPointerException e)
            {
            }

        }
        return "";*/

        //another method
        return "found the needle at position "+ Arrays.asList(haystack).indexOf("needle");

    }
}
