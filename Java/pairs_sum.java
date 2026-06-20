import java.util.Scanner ;
public class print_pairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no.");
        int k = scn.nextInt();
        int[] arr = {16,17,4,3,5,2,1} ;
        int len = arr.length ;
        for (int i = 0 ; i < len ;i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0 ; i<len ; i++){
            for (int j = 0 ; j<len ; j++){
                int sum = arr[i]+arr[j] ;
                if (sum>k)
                    System.out.print(arr[i]);
                    System.out.print(arr[j]+" ");
            }   
        }
    }
}

