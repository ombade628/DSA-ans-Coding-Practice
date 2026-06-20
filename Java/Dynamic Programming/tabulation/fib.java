//  Tabulation is all  about building a table 


package Tabulation;

import java.util.HashMap;

public class fib {
    HashMap<Integer,Long> map= new HashMap<>() ; 
    Long[] fib(int n ){
        Long[] arr = new Long[n+1] ; 
        arr[0] = 0L ; 
        arr[1] = 1L ; 
        // if(n==0) return arr ; 
        // if(n==1) return arr ; 
        for(int i=2 ;i<arr.length ;i++){
            arr[i]=arr[i-1]+arr[i-2]; 
        }
        return arr ; 
    }
    Long fib_arr(Long[] m ,int n){ 
        return m[n] ; 
    }
    Long fib_less_space(int n){
        if(n==0) return 0L ; 
        if(n==1) return 1l ; 
        Long a = 0L ; 
        Long b =1L ;
        for(int i=2 ;i<=n ;i++){
            Long c = a+b ;
            a= b; 
            b=c ; 
        }
        return b ;

    }
    public static void main(String[] args){
        fib obj  = new fib() ; 
        System.out.println(obj.fib_less_space(34));
        Long [] arr = obj.fib(34) ; 
         System.out.println(obj.fib_arr(arr , 10));
        System.out.println(obj.fib_arr(arr,15));
        System.out.println(obj.fib_arr(arr , 32));
    }
}
