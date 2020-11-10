public class Main {
    public static void main(String[] args) {
        int n=5;
        diamond(n);
    }
    public static void diamond(int n){
        if(n<0 || n%2==0){
            return;
        }
        else {
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(i+""+j+" ");

                }
                System.out.println("");
            }
        }
    }
}
