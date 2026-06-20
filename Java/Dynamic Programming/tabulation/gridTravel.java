package Tabulation;

public class gridTravel {
    int grid_travel(int n , int m){
        if(n==0 || m==0) return 0  ; 
        int[][] arr = new int[n][m] ;  
        for(int i = 1 ; i<arr.length ; i++ ) arr[i][0] = 1 ; 
        for(int j = 1; j<arr[0].length ; j++ ) arr[0][j] = 1 ; 
        for(int i = 1 ; i<arr.length ; i++ ){
            for(int j = 1; j<arr[0].length ; j++ ){
                arr[i][j] = arr[i-1][j] + arr[i][j-1] ; 
            }
        } 
        return arr[n-1][m-1] ; 
    }
      public static void main(String[] args){
        gridTravel obj = new gridTravel() ; 
        System.out.print(obj.grid_travel(1,2));
      }
}
