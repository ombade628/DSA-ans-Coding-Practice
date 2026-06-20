package Tabulation;

public class canSum {
    static boolean can_sum(int n , int [] m ){ 
        boolean[]arr = new boolean[n+1] ; 
        arr[0] = true; 
        for(int i = 0  ; i <= n ; i++ ){
            if(arr[i]){
                for(int num :m){
                    if((i+num)<=n){
                        arr[i+num] = true ; 
                    }
            }
            }
            
        }
        return arr[n] ; 
    }
    public static void main(String[] args){
        System.out.print(canSum.can_sum(7 , new int[]{3,4,5})) ; 
    }
}
