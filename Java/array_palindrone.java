import java.util.Scanner ;
public class array_palindrone {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
        int []arr1={100} ;
        for (int i = 0;i< 100 ; i++){
            int input = scn.nextInt();
            arr1[i] = input ;
            
            if ( input== 000){
                return ;
            } 
        }
        int len = arr1.length ;
        System.out.println();
    
        for (int i = 0 ;i< len/2 ; i++){
            if (arr1[i] == arr1[len-1-i]){
                System.out.print("following array is palindrone ");
            } 
            else{
                System.out.print("following array is not palindrone ");
                break ;
            }
        }
        
    }
}
