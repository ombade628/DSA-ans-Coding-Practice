import java.util.Arrays ; 
public class MergeSort {
    public static void mergerSort(int [] arr, int left , int right ){
        if(left<right){
            int mid  = left + (right-left)/2 ; 
            mergerSort(arr, left, mid);
            mergerSort(arr, mid+1, right);

            merge(arr, left , mid , right ) ; 
        }

    }
    public static void merge(int[]arr,int left,int mid, int right){
        // int a1 =
        // int[]ans = new int[arr1.lenght+ arr2.length] ;
        // int a1 = arr1.lenth ; 
        int a1 =mid- left + 1 ; 
        int a2 = right-mid ;
        int[] arr1 =new int[a1] ; 
        int[] arr2 =new int[a2] ; 
        for(int i =0 ; i<a1 ;i++ ){
            arr1[i] = arr[left+i] ; 
        }
        for(int i =0 ; i<a2 ;i++ ){
            arr2[i] = arr[mid+1+i] ; 
        }
        int i= 0 ; 
        int j= 0 ; 
        int k= left ;  



        // int n = a1+a2  ; 
        while(i <a1 && j< a2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i] ; 
                i ++ ; 
            }
            else{
                arr[k] = arr2[j] ; 
                j++ ;
            }
            k++ ; 
        } 
        while(i <a1){
            arr[k] = arr1[i] ; 
            i ++ ;
            k++ ;  
        } 
        while(j< a2){
            arr[k] = arr2[j] ; 
            j++ ;
            k++ ; 
        } 
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,3,5,1,6,7,12,45,56,43,21,18} ; 
        int n = arr.length -1;
        mergerSort(arr, 0 , n ) ;  
        System.out.println(Arrays.toString(arr)) ; 
    }
}
