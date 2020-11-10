import java.util.LinkedList;
import java.util.List;

public class Declaration extends Foundation{

    List declaringList = new LinkedList<String>();

    public Declaration(boolean next, boolean previous, List declaringList) {
        super(next, previous);
        this.declaringList = declaringList;
    }

    @Override
    String moveToNext(String value) {
        return null;
    }

    @Override
    String moveToPrevious(String value) {
        return null;
    }

    @Override
    void setNextItem(String value) {

    }

    @Override
    void setPreviousItem(String value) {

    }

    @Override
    int compareTo(String value) {
        return 0;
    }
}
