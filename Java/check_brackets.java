
import java.util.Scanner ;
import java.util.Stack ;
public class check_brackets{
    public static void main(String[] args) {       
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no. of element to add in stack :");
        int n = scn.nextInt();
        for(int i= 0 ;i<n ;i++){
            System.out.println("enter element  :"+i);
            int element = scn.nextInt();    
            s.push(element); 
        }
        System.out.println("enter element to search :");
        int k = scn.nextInt();
        boolean isavailable =false ; 
        while(!s.isEmpty()){
            // System.out.println(s.pop());
            int temp = s.pop() ; 
            if (temp  == k ){
                isavailable =  true ;
            }
        }
        System.out.println(isavailable);
    }
}