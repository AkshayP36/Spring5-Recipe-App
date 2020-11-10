import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactionAmount = new ArrayList<Double>();
    private ArrayList<String> customerName = new ArrayList<String>();

    public Customer(ArrayList<Double> transactionAmount, ArrayList<String> customerName) {
        this.transactionAmount = transactionAmount;
        this.customerName = customerName;
    }

    public ArrayList<Double> getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(ArrayList<Double> transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public ArrayList<String> getCustomerName() {
        return customerName;
    }

    public void setCustomerName(ArrayList<String> customerName) {
        this.customerName = customerName;
    }


}
