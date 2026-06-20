import java.util.Scanner ;

public class sum_odd_no {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("sum of 10 numbers is:");
        int nat = scn.nextInt();
        int sum  = 0 ;
        for(int i=1 ;i<=nat*2;i+=2){ 
            sum =sum + i ;
        }
        System.out.println("sum of n odd is:");
        System.out.print(sum);
    }
}
