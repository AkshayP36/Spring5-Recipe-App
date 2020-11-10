import java.util.List;

public class ParentBinarySearchTree extends Declaration{

    public ParentBinarySearchTree(boolean next, boolean previous, List declaringList) {
        super(next, previous, declaringList);
    }

    @Override
    String moveToNext(String value) {
        return super.moveToNext(value);
    }

    @Override
    String moveToPrevious(String value) {
        return super.moveToPrevious(value);
    }

    @Override
    void setNextItem(String value) {
        super.setNextItem(value);
    }

    @Override
    void setPreviousItem(String value) {
        super.setPreviousItem(value);
    }

    @Override
    int compareTo(String value) {
        return super.compareTo(value);
    }
}
