public class homework {
    public static void main(String[] args) {
        int[] arr1={0,1,0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,0,0};
        int len = arr1.length ;

        int temp= 1 ;
        int sum = 1 ;
        for (int i = 1 ;i<len ; i++){
            if(arr1[i] == arr1[i-1]){
                temp ++ ;
                if(temp > sum){
                    sum =temp ;
                }
            }
            else
                temp = 1 ;
                
        }    
        System.out.print(sum);
    }
}