class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int [] ar = {1,2,3,7,5} ;
        int targe = 12 ;
        int len =ar.length ;
        int start = 0; 
        int end = 0 ; 
        int sum=arr[0] ;
        for (int i=0 ;i<len;i++){
            for(int j=start;j<end ;j++){
                sum += ar[j]; 
            }
            if (sum==targe){
                System.out.println(start+ ", "+ end);
            }
            else if (sum>targe){
                start ++ ; 
            }
            else if (sum<targe){
                end++ ;
            }
        }
    }
}
