 class Solution{
    void selectionSort(int [] arr){
        int len =arr.length ;
        for(int i = 0 ; i<len-1 ; i++){
            int small = i ; 
            for(int j=i+1 ; j<len; j++){ 
                if(arr[j]<arr[small] ){
                      small =j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[small]; 
            arr[small] = temp;
        }
        for(int i = 0 ; i< len ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class sort{
    public static void main(String[] args){
        int[] a = { 4, 1, 3, 9, 7 };
        Solution obj =new Solution();
        obj.selectionSort(a);
        
        for (int i=0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
}