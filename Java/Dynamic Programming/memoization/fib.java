package memoization;
import java.util.* ; 
public class fib {

    // this structure fails and slows down when there is big number of problems ;   ex.  i try running for fib(50)
    
    static Long fib1(int n){
            if(n<=2){
            return 1L; 
        }
        Long ans = fib1(n-1) +fib1(n-2) ;

        return ans ; 
    }
    HashMap<Integer,Long> map = new HashMap<> ();    //  for dynamic programming 
    Long fib2(int n){
        if(n<=2) return 1L ; 
        if(map.containsKey(n)) return map.get(n) ; 

         
        Long ans = fib2(n-1) + fib2(n-2) ; 
        map.put(n,ans) ; 
        return ans ; 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        System.out.println("Enter the fibonnaci value you want :") ; 
        int value = scn.nextInt() ; 
        fib obj  = new fib()  ; 
        System.out.println("value of fib "+ obj.fib2(value)) ; 
        // System.out.println("value of fib "+ fib1(value)) ; 

        scn.close();
    }
}

 