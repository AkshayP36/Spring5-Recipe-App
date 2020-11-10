import java.math.BigDecimal;
import java.util.Scanner;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        for(int i=s.length-3;i>=0;i--){
            for(int j=0;j<i;j++){
                BigDecimal a=new BigDecimal(s[j]);
                BigDecimal b=new BigDecimal(s[j+1]);
                if(a.compareTo(b)<0){
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }

              //  System.out.println(s[j]+" ");
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}