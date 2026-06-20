import java.util.Scanner ;
public class count_even_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no.") ;
        int num = scn.nextInt(); 
        int count_even =0 ;
        int count_odd = 0 ;
        for(;num!=0;num=num/10){
            if(num % 2 == 0 ){
                count_even++ ;
            }
            else {
                count_odd++ ;  
            }

        }
        System.out.println(count_even);
        System.out.println(count_odd);
    }   
}
