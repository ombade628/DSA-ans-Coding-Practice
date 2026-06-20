public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,8,9} ;
        int len = arr.length ;
        for (int i = 0 ; i< len ;i++){
            System.out.print(arr[i] +" ");
        }
        // int[] arr1 = {0};
        for (int i = 0 ; i< len ;i++){
            if(arr[i]==arr[i+1]){
                for (int  j=i ; j<len-2 ;j++){
                    int temp = 0 ;
                    temp =arr[i+1];
                    arr[i+1]= arr[i+2];
                    arr[i+2]=0 ;
                }
            }
            else{
                return ;
            }
        }
        for (int i = 0 ; i< len-1 ;i++){
            System.out.println(arr[i]);
        }
    }
    
}
