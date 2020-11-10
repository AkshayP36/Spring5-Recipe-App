public class RecrusionFactorial {
    public static void main(String[] args){
        int n=5;
        long recrusion = recrusion(n);
        System.out.println(recrusion);
    }
    public static long recrusion(int n){
        if(n==0)
            return 1;
        return (n * recrusion(n-1));
    }
}
