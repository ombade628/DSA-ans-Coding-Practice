import java.util.Scanner ; 
public class slide_window {
    public static void main(String[] args) {        
        // for(int i=0;i<n;i++){
            //     System.out.print("enter element "+i);
            //     int input = scn.nextInt();
            //     arr[i]= input ; 
        // } 
        
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // } 
        
        // for(int i=0;i<k;i++){
            //     sum=sum+arr[i];
            // } 
        // max_sum=sum ; 
        
        // for(int i=k;i<n;i++){
            //     sum=sum- arr[i-k] + arr[i];

        //     if(sum>max_sum){
        //         max_sum=sum ;
        //     }

        // }
        
        // System.out.println("max sum = ");
        // System.out.print(max_sum);
        
        Scanner scn = new Scanner(System.in);
        System.out.print("enter num of  element you want to ener ");
        int n = scn.nextInt();
        int []arr  = new int[n];
        
        for(int i=0;i<n;i++){
                System.out.print("enter element "+i);
                int input = scn.nextInt();
                arr[i]= input ; 
        } 
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.print("enter k ");
        int k = scn.nextInt(); 
        int count  = 0 ;
        int sum = arr[0] ; 
        if (arr[0]==k){
            count = count+1 ;
        }

        for(int i=0;i<n*n ;i++){
            int start = 0 ;
            int end = 0  ;
            for(int i=start;i<=end;i++){
                sum=sum- arr[i-k] + arr[i];
                
                if(sum>max_sum){
                    max_sum=sum ;
                }
            }
        } 
        
            
        
        // System.out.println("max sum = ");
        // System.out.print(max_sum);

        if(sum == k){
            max_sum=sum ;
            System.out.println("sum which is equal to k is  = "+ sum);
        }
        
    }                                               
    
}




