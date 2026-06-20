package Tabulation;

import java.util.ArrayList;

public class howSum {
    
    static ArrayList<ArrayList<Integer>> how_sum(int n , int [] m ){ 
        ArrayList<ArrayList<Integer>>[] arr = new ArrayList[n+1] ; 
        arr[0] = new ArrayList<>() ; 
        arr[0].add(new ArrayList<>()); 
        for(int i = 0  ; i <= n ; i++ ){
            if(arr[i] != null){
                for(int num :m){
                    int next = i +num ; 
                    if(next <= n){
                        if(arr[next]==null){
                            arr[next] = new ArrayList<>() ; 
                        }
                        for(ArrayList<Integer> list :arr[i])  {
                            ArrayList<Integer> new_list = new ArrayList<>(list) ; 
                            new_list.add(num) ; 
                            arr[next].add(new_list) ; 
                        }
                    }
                }
            }
            
        }
        return arr[n] ; 
    }
    public static void main(String[] args){
        System.out.print(how_sum(8 , new int[]{2 ,3,5})) ; 
    }
}
