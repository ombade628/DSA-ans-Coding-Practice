// Combanatoric Problem 
package DP.memoization;
import java.util.HashMap;

public class howSum {
    HashMap<Integer,Boolean> map = new HashMap<>() ;
    Boolean can_Make_Target(int target , int[] n ){
        if(map.containsKey(target)) return map.get(target) ; 
        if(target==0) return true ;  
        if(target<0) return false ;
        // Boolean ans = can_Make_Target(target, n) ;
        Boolean ans= false ; 
        for(int num:n){
            ans = can_Make_Target(target - num,n)  ; 
            if(ans){
                map.put(target , true) ; 
                return true ; 
            } 
        }
        map.put(target,false) ; 
        return false ; 
    }
    public static void main(String[] args) {
        howSum  obj = new howSum() ; 
        // Scanner scn = new Scanner(System.in) ;
        // System.out.println("enter m for grid traversal: ") ; 
        // int m = scn.nextInt();
        // System.out.println("enter n for grid traversal: ") ; 
        // int n = scn.nextInt() ; 
        // System.out.println(7obj.grid_travel_memo(m, n)) ; 
        int[] n = {2,3};
        System.out.println(obj.can_Make_Target(7, n)) ;  
        obj.map.clear();
        System.out.println(obj.can_Make_Target(7, new int[]{2,4})) ; 
        obj.map.clear();
        System.out.println(obj.can_Make_Target(7, new int[]{5,3,4,7})) ; 
        obj.map.clear(); 
        System.out.println(obj.can_Make_Target(8, new int[]{2,3,5})) ;  
        obj.map.clear(); 
        System.out.println(obj.can_Make_Target(70021, new int[]{7,14})) ;  
        // System.out.println(obj.can_Make_Target(7, new int[]{2,4,3,4})) ;  
        // System.out.println(obj.c an_Make_Target(7, new int[]{2,4,3,4})) ;  
        // System.out.println(obj.can_Make_Target(7, new int[]{2,4,3,4})) ;  
        // System.out.println(obj.can_Make_Target(7, new int[]{2,4,3,4})) ;  


    }
}
