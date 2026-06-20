import java.util.Scanner ;
public class Array {
    public static void main(String[] args) {
        int[] arr1={1,57,3,56,5,6,7,8,4};
        int len = arr1.length ;
        // int sum = 0 ;
        // int large = arr1[0] ; 
        // int small = arr1[0] ;
        // for (int i = 0 ;i<len ; i++){
        //     System.out.print(arr1[i]);
        //     sum = sum + arr1[i];
        //     if(arr1[i] > large ){
        //         large= arr1[i];
        //     }
        //     if(arr1[i] < small ){
        //         small= arr1[i];
        //     }
        // }
        
// 

        // System.out.println();
        // System.out.print("Sum of all numbers is :");
        // System.out.println(sum);
        // System.out.print("Largest numbers is :");
        // System.out.println(large);
        // System.out.print("Smallest numbers is :");
        // System.out.println(small);
        // int even =0 ;
        // int odd =0  ;
        // for (int i = 0 ;i<len ; i++){
        //     if(arr1[i] % 2 == 1 ){
        //         odd ++ ;
        //     }
        //     else if(arr1[i] % 2 == 0 ){
        //         even ++ ;
        //     }
        // }
        // System.out.print("number of odds  are :");
        // System.out.println(odd);
        // System.out.print("numbers of evens are :");
        // System.out.println(even);

        // Scanner scn = new Scanner(System.in) ;
        // int k = scn.nextInt(); 
        // int m = scn.nextInt(); 
        // for (int i = 0 ;i<len ; i++){
        //     if(arr1[i]  == k ){
        //         System.out.println(i);;
        //     }
        //     else if(arr1[i]  == m ){
        //         ;
        //     }
        // }

// reversing the array

        // for (int i = 0;i< len  ; i++){
        //     System.out.print(arr1[i]+" ");
        // }
        // System.out.println();
    
        // for (int i = 0 ;i< len/2 ; i++){
        //     int temp = arr1[i];
        //     arr1[i]=arr1[len-1-i] ;
        //     arr1[len-1-i] = temp ; 
        // }
        // for (int i = 0;i< len  ; i++){
        //     System.out.print(arr1[i]+" ");
        // }


// find the second largest no. in teh array 
        // int large = 0 ;
        // int large2 = 0 ;
        // for (int i = 0 ;i< len/2 ; i++){
        //     if(arr1[i] > large ){
        //         large= arr1[i];
        //     }
        // }
        // for (int i = 0 ;i< len; i++){
        //     if (arr1[i] != large){
        //         if(arr1[i] > large2 ){
        //             large2= arr1[i];
        //         }
        //     }
        // }
        // System.out.print(large2+" ");

//    min sum of two elements :
        
        // int min_sum = arr1[0] + arr1[1] ;
        // for (int i = 0 ;i< len; i++){
        //     for (int j = 0 ;j< len; j++){ 
        //         int temp = 0 ;
        //         if(i!=j){
        //             temp =  arr1[i] + arr1[j]  ;
        //             if(temp<min_sum){
        //                 min_sum = temp ;
        //             }
        //         }
        //     }

        // }
        // System.out.print(min_sum+": is the min sum of array ");

// Finding  missing number :
        int large = 0 ;
        for (int i = 0 ;i< len; i++){
            if(arr1[i]>large){
                large  =  arr1[i]  ;
            }
        }
        for (int i = 0 ;i<large  ; i++){
            for (int j = 0 ;i<len ; i++){
                if(i != arr1[j]){
                    System.out.print(i+" ");
                }
            }
        }

        // Palindrone

        for (int i = 0;i< len  ; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    
        for (int i = 0 ;i< len/2 ; i++){
            if (arr1[i] == arr1[len-1-i]){
                System.out.print("following array is palindrone ");
            } 
            else{
                System.out.print("following array is not palindrone ");
            }
        }
    }
}