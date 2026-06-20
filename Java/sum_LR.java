    public class sum_LR {
        public static void main(String[] args) {
            int[] arr = {16,17,4,6,15,2,1,13} ;
            int len = arr.length ;
            int sum  = 0 ; 
            for (int i = 0 ; i < len ;i++){
                System.out.print(arr[i] + " ");
                sum+=arr[i] ;
            }
            System.out.println(sum);
            System.out.println();
            for (int i = 0 ; i<len;i++){
                int sum_left = 0 ;
                for (int j = 0 ; j <i ;j++){
                    sum_left += arr[j];
                }  
                if (sum_left == sum/2){
                   System.out.print(i +" : is the no of starting of right array");
                } 
            }
        }
    }