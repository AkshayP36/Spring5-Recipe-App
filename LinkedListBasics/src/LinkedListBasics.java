import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {

        LinkedList<String> bestPlaces= new LinkedList<>();
        bestPlaces.add("Mumbai");
        bestPlaces.add("Pune");
        bestPlaces.add("Goa");
        bestPlaces.add("Kolkata");
        Iterator<String> i = bestPlaces.iterator();
        System.out.println("Iterator = "+i);
        while(i.hasNext()){
            System.out.println("value =  " +i.next());
        }
        bestPlaces.add(0,"Bangaluru");

        System.out.println("--------------------");

        i = bestPlaces.iterator();
        System.out.println("Iterator = "+i);
        while(i.hasNext()){
            System.out.println("value =  " +i.next());
        }

    }
}
