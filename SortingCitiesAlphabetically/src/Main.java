import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("AMumbai");
        placesToVisit.add("ZMumbai");
        placesToVisit.add("DMumbai");
        placesToVisit.add("WMumbai");
        placesToVisit.add("EMumbai");
        placesToVisit.add("QMumbai");

        printList(placesToVisit);

        placesToVisit.add(1, "RMumbai");
       // printList(placesToVisit);
        //System.out.println("After adding JMumbai___________________________________________");
        boolean u = addInOrder(placesToVisit, "JMumbai");
        //printList(placesToVisit);
        //System.out.println("After adding QMumbai__________________________________________");
        boolean i = addInOrder(placesToVisit, "QMumbai");
        //System.out.println("___________________________________________");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linked){
        Iterator<String> i= linked.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("___________________________________________");
    }

    private static boolean addInOrder(LinkedList<String> callList, String newCity){
        ListIterator<String> calledList = callList.listIterator();

        while(calledList.hasNext()){
            int comparison = calledList.next().compareTo(newCity);
            //System.out.println("value of comparison = "+comparison);
            //printList(callList);

            //value 0 means the entered value is present in the linkedList

            if(comparison ==0){
                System.out.println("city already exists");
                return false;
            }
            // new city should appear this one
            else if(comparison>0){
                calledList.previous();
                calledList.add(newCity);
                return true;
                // calledList.add(newCity);

            }
        }
        calledList.add(newCity);
        return true;

    }
}
