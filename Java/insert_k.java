import java.util.Scanner;
public class insert_k {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter position of :");
        int k = scn.nextInt();
        System.out.println("enter element:");
        int element = scn.nextInt();
        int[] arr = {1,2,3,3,4,5,6,7,8,9} ;
        int len = arr.length ;
        
    
        int temp = arr[k] ;
        arr[k]= element ;
        int temp1=0 ;
        for (int i=k ; i< len ;i++){
            temp1 = arr[i+1];
            arr[i+1] =temp;
        }
        
        for (int i = 0 ; i< len ;i++){
            System.out.println(arr[i]);
        }
    }
    
}
