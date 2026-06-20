package DP.memoization;

import java.util.HashMap;

public class canconstruct {
    HashMap<String,Boolean> map = new HashMap<>() ; 
    Boolean can_construct(String target , String [] n ){
        if(map.containsKey(target)) return map.get(target) ; 
        if(target.isEmpty()) return true;
        for(String sg : n){
            if(target.startsWith(sg)){
                Boolean ans = can_construct(target.substring(sg.length()), n); 
                if(ans){
                    map.put(target,true) ; 
                    return true ; 
                }
            }
        } 
        map.put(target,false) ; 
        return false ;
    }
    HashMap<String,Integer> map1 = new HashMap<>() ; 
    int count_construct(String target , String [] n ){
        if(map1.containsKey(target)) return map1.get(target) ; 
        if(target.isEmpty()) return 1;
        int totalways = 0 ; 
        for(String sg : n){
            if(target.startsWith(sg)){
                int numways = count_construct(target.substring(sg.length()), n); 
                totalways += numways ; 
            }
        } 
        map1.put(target,totalways) ; 
        return totalways ;
    }
    public static void main(String[] args){
        canconstruct obj = new canconstruct() ; 
        System.out.print( obj.can_construct("skateboard" , new String[]{"bo","rd","ate","t","ska","sk","boar"}));
        System.out.println(obj.count_construct("skateboard" , new String[]{"bo","rd","ate","t","ska","sk","boar"}));
         obj.map.clear();
        System.out.print( obj.can_construct("abcdef" , new String[]{"ab","abc","cd","def","abcd"}));
        System.out.println( obj.count_construct("abcdef" , new String[]{"ab","abc","cd","def","abcd"}));
         obj.map.clear();
        System.out.print(obj.can_construct("enterapotentpot" , new String[]{"a","p","ent","enter","ot","o","t"}));
        System.out.println(obj.count_construct("enterapotentpot" , new String[]{"a","p","ent","enter","ot","o","t"}));
        obj.map.clear();
         System.out.println(obj.can_construct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef" , new String[]{"e","ee","eee","eeee","eeeee"}));
        obj.map.clear(); 
         
    }
}
