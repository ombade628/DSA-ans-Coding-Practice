public class leader_array {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2,1} ;
        int len = arr.length ;
        for (int i = 0 ; i < len ;i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println();
        for (int i = 0 ; i<len;i++){
            int temp = 0 ;
            for (int j = i+1 ; j<len ;j++){
            
                if (arr[i]<arr[j]){
                    temp ++;
                    break ;
                }
            }   
            if (temp == 0){
               System.out.print(arr[i] +" ");
            } 
        }
    }
}
