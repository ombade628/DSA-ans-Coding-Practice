import java.util.Scanner;
public class Find_maxno_digit {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int num = scn.nextInt();
        int max = 0;
        for(;num!=0;num=num/10){
            int temp = num %10 ;
            if(temp >max){
                max = temp ;
            }

        }
        
        System.out.println(max);
    }   
}
