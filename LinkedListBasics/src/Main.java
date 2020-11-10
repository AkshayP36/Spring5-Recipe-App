import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer ("CustomerFirstName CustomerLastName", 50.12);
        Customer secondCustomer = customer;
        secondCustomer.setName("FirstName LastName");

        System.out.println("The name in the customer object"+customer.getName()+" with total value = "+customer.getValue());


        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(45);
        array.add(3);
        array.add(78945);

        for(int i=0; i<array.size() ; i++){
            System.out.println(i+" value = "+array.get(i));
        }

        array.add(1,965);
        for(int i=0; i<array.size() ; i++){
            System.out.println(i+" value = "+array.get(i));
        }

        array.remove(2);

        for(int i=0; i<array.size() ; i++){
            System.out.println(i+" value = "+array.get(i));
        }
    }
}
