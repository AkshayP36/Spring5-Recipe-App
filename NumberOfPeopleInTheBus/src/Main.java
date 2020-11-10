import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        int count = countPassengers(list);
        System.out.println("count = "+count);
    }
    public static int countPassengers(ArrayList<int[]> list){
       int in=0,out=0;
        for( int i = 0; i < list.size(); i++ ) {
            for (int j = 0; j < list.get(i).length; j++) {
                if (j == 0)
                    in = in + list.get(i)[j];
                else if (j == 1)
                    out = out + list.get(i)[j];

            }
        }
        return in-out;
    }

}
