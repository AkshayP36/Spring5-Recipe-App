import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //To declare Map
        Map<String, String> currency= new HashMap<>();

        //To set values in the Map
        currency.put("India", "Rupees");
        currency.put("USA", "Dollars");
        currency.put("England","Euro");
        currency.put("UAE","Dinnar");

        //To a value print values from the HashMap
        System.out.println(currency.get("USA"));

        // To print all values from a hashmap
        System.out.println("");
        for(String key : currency.keySet()){
            System.out.println(key+" has currency value = "+currency.get(key));
        }

        //To check the key already exists
        if(currency.containsKey("Russia"))
            System.out.println("Currency for Russia listed");
        else
            System.out.println("Currency for Russia haven't been listed yet.");
        if(currency.containsKey("England"))
            System.out.println("Currency for England listed");
        else
            System.out.println("Currency for England haven't been listed yet.");

        // To remove a key value from the hash map
        currency.remove("England");
        for(String keys: currency.keySet()){
            System.out.println(keys+"'s currency is = "+currency.get(keys));
        }

        //To update the value from existing key
        System.out.println("\n\n");
        currency.put("India", "Rupee Gandhi Series");
        for(String key : currency.keySet()){
            System.out.println(key+"'s currency = "+currency.get(key));
        }
    }
}
