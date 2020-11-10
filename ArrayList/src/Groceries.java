import java.util.ArrayList;

public class Groceries {
    private int[] myNumbers=new int[5];
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("Number of total items in ArrayList = "+groceryList.size());
        for(int i=0; i< groceryList.size() ; i++){
            System.out.println("Elements = "+groceryList.get(i));
        }
    }

    public void modifyGroceryItems(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+" has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0)
            return groceryList.get(position);

        return null;
    }
}
