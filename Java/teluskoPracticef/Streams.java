package java_development;
import java.util.* ; 
import java.lang.*  ; 

public class Streams {
     public static void main(String[] args) {
        int size = 10_000 ; 
        List<Integer> list = new ArrayList<>() ; 
        Random rand = new Random() ;  
        for(int i =0 ; i<size ; i++){
            list.add(rand.nextInt(100))  ; 
        }
        long start1 = System.currentTimeMillis() ; 
        int sum1 = list.stream().filter(n->n%2==0)
        .map(n->n*2).reduce(0,(c,e)->c+e) ; 

        long end1 = System.currentTimeMillis() ; 
        int sum2 = list.parallelStream().filter(n->n%2==0)
        .map(n->n*2).reduce(0,(c,e)->c+e) ; 

        long end2 = System.currentTimeMillis() ; 
        // int timeSum1 = ;  
        // int timeSum2 = end1 - end2 ; 
        System.out.println(start1) ;
        System.out.println(sum1 + " "+(end1- start1)) ;
        System.out.println(sum2 + " "+(end2 -end1)) ;
        System.out.println( end2) ; 
     }
}
