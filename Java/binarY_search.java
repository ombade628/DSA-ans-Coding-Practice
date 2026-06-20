import java.util.Scanner ;
public class binarY_search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr ={2,4,9,11,13,51} ;
        int len = arr.length ;
        int end = len-1 ; 
        int start = 0 ;
        int mid = (start/2) + (end/2) ;
        for(int i=0 ; i<=len ;i++)
            if(mid == arr[num]){
                System.out.println("value Found at place"+i) ;
            }
            else if(mid>num){
                start =mid ;

            }
            else if(mid<num){
                end =mid ;
            }
         
        
    }    
}
