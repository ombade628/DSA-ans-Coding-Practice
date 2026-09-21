package java_development;

import java.util.Arrays;
import java.util.* ; 

public class MethodRefer {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Navin", "Om", "Harsh", "John") ; 
        List<String> names = list.stream().map(String::toUpperCase).toList() ;  
        System.out.println(names) ; 
    }
}
