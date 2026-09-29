// package java_development;
import java.util.Arrays ; 
public class QuickSort{
    public int a =0 ; 
    public static  void quickSort(int[]arr, int low, int high){
        if(low<high){
            int i =low-1 ;
            int pivot = arr[high] ;     

            for(int j= low ; j<high ; j++ ){
                // obj.a++ ; 
                if(arr[j]<pivot){
                    i++ ;
                    int temp  = arr[i] ; 
                    arr[i] =arr[j] ;  
                    arr[j] =temp  ;
                }
            }
            int temp  = arr[i+1] ; 
            arr[i+1] =arr[high] ;  
            arr[high] = temp  ;

            quickSort(arr, low, i );
            quickSort(arr, i+2, high);
        }
        // return ans; 
    }

    public static void main(String[]args){
        int[] arr = { 7, 8, 9, 10, 11,4, 5, 12, 13, 14, 15,1, 2, 3,  6, 16, 17, 18, 19};
        int n = arr.length - 1; 
        // QuickSort obj = new QuickSort() ; 
        quickSort(arr,0, n ) ; 
        // System.out.println(obj.a);

        System.out.println(Arrays.toString(arr)); 
    }
} 