import java.util.ArrayList;

public class Branch {
    ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public Branch(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }
}
