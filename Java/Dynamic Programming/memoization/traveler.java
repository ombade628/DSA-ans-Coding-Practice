package DP.memoization;
import java.util.* ; 

public class traveler {
    HashMap<String,Long> map = new HashMap<>() ; 
    // 50 sec for 18 by 18  ; 
    static Long grid_travel(int m , int n){
        if(m==1 && n== 1) return  1L ; 
        if( n == 0 || m ==0 ) return 0L ; 
        Long ans = grid_travel(m-1 ,n) + grid_travel(m, n-1) ; 
        return ans ; 
    }
    Long grid_travel_memo(int m , int n ){
        String memo = Math.min(m,n) +","+ Math.max(m,n) ; 
        if (map.containsKey(memo)) return map.get(memo) ;
        if(m==1 && n==1) return 1L  ; 
        if(m==0 || n==0) return  0L ; 

        Long ans =grid_travel_memo(m-1, n) + grid_travel_memo(m, n-1) ;
        map.put(memo,ans)  ; 
        return ans ; 
    }
    public static void main(String[] args) {
        traveler obj = new traveler() ; 
        Scanner scn = new Scanner(System.in) ;
        // System.out.println("enter m for grid traversal: ") ; 
        // int m = scn.nextInt();
        // System.out.println("enter n for grid traversal: ") ; 
        // int n = scn.nextInt() ; 
        // System.out.println(obj.grid_travel_memo(m, n)) ; 
        System.out.println(obj.grid_travel_memo(34, 34)) ;
        obj.map.clear(); 
        System.out.println(grid_travel(2, 6)) ; 
        obj.map.clear();
        System.out.println(grid_travel(3, 8)) ; 
        obj.map.clear();
        System.out.println(grid_travel(4, 7)) ; 
        obj.map.clear();
        System.out.println(grid_travel(5, 6)) ; 
        obj.map.clear();
        scn.close();
    }
}

    

// for Big Integer 


// package DP.memoization;
// import java.math.BigInteger;
// import java.util.* ; 

// public class traveler {
//     HashMap<String,BigInteger> map = new HashMap<>() ; 
//     // 50 sec for 18 by 18  ; 
//     static BigInteger grid_travel(int m , int n){
//         if(m==1 && n== 1) return BigInteger.ONE ; 
//         if( n == 0 || m ==0 ) return BigInteger.ZERO ; 
//         BigInteger ans = grid_travel(m-1 ,n).add(grid_travel(m, n-1)) ; 
//         return ans ; 
//     }
//     BigInteger grid_travel_memo(int m , int n ){
//         String memo = Math.min(m,n) +","+ Math.max(m,n) ; 
//         if (map.containsKey(memo)) return map.get(memo) ;
//         if(m==1 && n==1) return BigInteger.ONE  ; 
//         if(m==0 || n==0) return  BigInteger.ZERO ; 

//         BigInteger ans =grid_travel_memo(m-1, n).add(grid_travel_memo(m, n-1)) ;
//         map.put(memo,ans)  ; 
//         return ans ; 
//     }
//     public static void main(String[] args) {
//         traveler obj = new traveler() ; 
//         Scanner scn = new Scanner(System.in) ;
//         // System.out.println("enter m for grid traversal: ") ; 
//         // int m = scn.nextInt();
//         // System.out.println("enter n for grid traversal: ") ; 
//         // int n = scn.nextInt() ; 
//         // System.out.println(obj.grid_travel_memo(m, n)) ; 
//         System.out.println(obj.grid_travel_memo(150, 150)) ; 
//         obj.map.clear();
//         System.out.println(grid_travel(2, 6)) ; 
//         obj.map.clear();
//         System.out.println(grid_travel(3, 8)) ; 
//         obj.map.clear();
//         System.out.println(grid_travel(4, 7)) ; 
//         obj.map.clear();
//         System.out.println(grid_travel(5, 6)) ; 
//         obj.map.clear();
//         scn.close();
//     }
// }

    