import java.util.ArrayList;
class IntClass{
    private int myValue;
    public IntClass(int myValue){
        this.myValue=myValue;
    }
    public int getMyValue(){
        return myValue;
    }
    public void setMyValue(int myValue){
        this.myValue=myValue;
    }
}
public class Main {
    public static void main(String[] args){
        String[] strArray = new String[50];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("akshay");

        ArrayList<IntClass> integerArrayList = new ArrayList<IntClass>();
        integerArrayList.add(new IntClass(54));

        Integer integer=new Integer(54);
        Double doubleValue = new Double(54);


    }
}
