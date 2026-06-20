package memoization;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class allConstruct {
    HashMap<String,ArrayList<ArrayList<String>>> map = new HashMap<>() ; 
    ArrayList<ArrayList<String>>  all_construct(String target , String [] n ){
        if(map.containsKey(target)) return map.get(target) ;
        ArrayList<ArrayList<String>> list = new ArrayList<>() ; 
        if(target.isEmpty()){
            list.add(new ArrayList<>()) ;
            return list ; 
        }  
        for(String sg : n){
            if(target.startsWith(sg)){
                ArrayList<ArrayList<String>> ways = all_construct(target.substring(sg.length()), n);
                for(ArrayList<String> way : ways){
                    ArrayList<String> temp = new ArrayList<>() ; 
                    temp.add(sg) ; 
                    temp.addAll(way); 
                    list.add(temp) ;
                }
            }
        } 
        map.put(target, list) ; 
         return list ;
    }
    // HashMap<String,Integer> map1 = new HashMap<>() ; 
    // int count_construct(String target , String [] n ){
    //     if(map1.containsKey(target)) return map1.get(target) ; 
    //     if(target.isEmpty()) return 1;
    //     int totalways = 0 ; 
    //     for(String sg : n){
    //         if(target.startsWith(sg)){
    //             int numways = count_construct(target.substring(sg.length()), n); 
    //             totalways += numways ; 
    //         }
    //     } 
    //     map1.put(target,totalways) ; 
    //     return totalways ;
    // }
    public static void main(String[] args){
        allConstruct obj = new allConstruct() ; 
        System.out.println( obj.all_construct("skateboard" , new String[]{"bo","rd","ate","t","ska","sk","boar"}));
        System.out.println(obj.all_construct("enterapotentpot" , new String[]{"a","p","ent","enter","ot","o","t"}));
        System.out.println(obj.all_construct("abcdef" , new String[]{"ab","abc","cd","def","abcd"}));
        System.out.println(obj.all_construct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz" , new String[]{"a","aa","aaa","aaaa","aaaab"}));
        
    }
}
