





import java.util.Scanner;
public class no_digit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("enter num") ;
        int num = scn.nextInt();
        int sum = 0;
        int count = 0;
        for(int i=0;i<=100;i++){
            int newvar = num % 10 ;
            sum += newvar ;
            num = (num-newvar)/10 ;
            
        }
        System.out.println(sum);
    } 
}

  