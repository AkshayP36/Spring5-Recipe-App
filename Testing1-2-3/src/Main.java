import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        lines.add(0,"a");
        lines.add(1,"e");
        lines.add(2,"i");
        lines.add(3,"o");
        lines.add(4,"u");

        List<String> updatedLine = new ArrayList<String>();
        for(int i=0; i<lines.size(); i++){
            updatedLine.add(i, (i+1)+": "+lines.get(i));
        }
        System.out.println(updatedLine);
    }
}
