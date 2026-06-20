import java.util.Scanner ;

public class fact_no {
    public static void main (String[] args){
        System.out.println("enter no. for factotial:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int fact  = 1 ;
        for(int i=1 ;i<=num ;i++){ 
            fact = fact * i  ;
        }
        System.out.println("factorial of 10 numbers is:");
        System.out.print(fact);
    }

}
