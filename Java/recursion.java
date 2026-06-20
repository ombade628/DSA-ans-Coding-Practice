// import java.util.Scanner ;

// class GFG{

//     static int fibonacci (int n){
//         if (n == 0 || n==1){
//            return n ;
//         }
//         if (n==1 ){
//           return (fibonacci(n-1) + fibonacci(n-2)) ;
//         }
//     }
    
//     public static void main (String[] args){
//         Scanner scn = new Scanner(System.in);
//         System.out .println("enter the number");
//         int a = scn.nextInt();
//         int fsum= fibonacci(a);
//         System.out .println(fsum);
//     }          
// }
import java.util.Scanner;

class GFG {

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scn.nextInt();
        int fsum = fibonacci(a);
        System.out.println("Fibonacci of " + a + " is: " + fsum);
    }
}
