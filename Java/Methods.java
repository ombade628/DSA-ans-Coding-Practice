// import java.util.Scanner ;

// public class Functions {
//     static void Greetings(String name){
//         System.out.println("Hello "+name+"!");
//     }
//     public static void main(String[] args) {
//         Scanner scn =  new Scanner(System.in);
//         System.out.println("Give first name  :");
//         String name = scn.nextLine();
//         Greetings(name);
//     }
// }

// import java.util.Scanner ;

//     public class Functions {
//     static void Calculator(int a ,String operator, int b){
//         if(operator.equals("+")){
//             int value = a + b ;
//             System.out.println("addition of numbers is : "+value+"!");
//         }
//         else if(operator.equals("*")){
//             int value = a * b ;
//             System.out.println("Multiplication of numbers is : "+value+"!");
//         }
//         else if(operator.equals("/")){
//             int value = a / b ;
//             System.out.println("Division of numbers is : "+value+"!");
//         }
//         else if(operator.equals("-")){
//             int value = a - b ;
//             System.out.println("Substraction of numbers is : "+value+"!");
//         }
//         else{
//             System.out.println("There is problen");

            
//         }
        
//     }
//     public static void main(String[] args) {
//         Scanner scn =  new Scanner(System.in);
//         Scanner scn1 =  new Scanner(System.in);
//         System.out.println("Give first number  :");
//         int first = scn.nextInt();
//         System.out.println("Give operator  :");
//         String op = scn1.nextLine();
//         System.out.println("Give second number  :");
//         int second = scn.nextInt() ;  
//         int value = first + second ; 
//         Calculator(first,op,second);
//     }
// }

import java.util.Scanner ;

    public class Methods {
        static void return_value(int a){
            int value = a*a ;
            System.out.println("hello World "+value+":");
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the no. :");
            int num = scn.nextInt();
            return_value(num) ;
        }
    }