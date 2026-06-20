import java.util.Scanner ;

public class fibonacci {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("fibonacci of n numbers is:");
        int nat = scn.nextInt();
        int count =0 ;
        for(int i=1 ;i<= 100;i++){ 
            int div = nat /  10 ** i ;
            
            if (div>=1){
                count +=1 ;
            }
        }
        System.out.print(count);
    }
}
