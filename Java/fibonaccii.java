import java.util.ArrayList;
public class fibonaccii {
    public static void main(String args[]){
        int a = 0 ;
        int b = 1 ;
        int n =6 ; 
        System.out.println(a);
        System.out.println(b);
        for (int i =0 ;i<n-2 ;i++){
            int sum =a+b ;
            a = b ;
            b=sum ;
            System.out.println(sum);
        }
        
    }
}
