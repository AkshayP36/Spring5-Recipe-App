import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchArrayList = new ArrayList<Branch>();

    public Bank(ArrayList<Branch> branchArrayList) {
        this.branchArrayList = branchArrayList;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }

    public void setBranchArrayList(ArrayList<Branch> branchArrayList) {
        this.branchArrayList = branchArrayList;
    }
}
