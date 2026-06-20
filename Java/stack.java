// import java.util.Stack ;
// public class stack{
//     public static void main(String[] args) {
//         Stack<Integer>s = new Stack<>();

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(s.isempty()){
//             System.out.println(s.pop);
//         }
//     }
// }

// create a stack add data to it  and search elemment k is available find true or false 

// import java.util.Scanner ;
// import java.util.Stack ;
// public class stack {
//     public static void main(String[] args ){
//         Stack<Integer>s = new Stack<>();
        
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
        
//         Scanner scn = new Scanner(System.in);
//         System.out.println("enter no. of element to add in stack :");
//         int n = scn.nextInt();
//         for(int i= 0 ;i<n ;i++){
//             System.out.println("enter element  :"+i);
//             int element = scn.nextInt();
//             s.push(element); 
//         }
//         System.out.println("enter element to search :");
//         int k = scn.nextInt();
//         boolean isavailable =false ; 
//         while(!s.isEmpty()){
//             // System.out.println(s.pop());
//             int temp = s.pop() ; 
//             if (temp  == k ){
//                 isavailable =  true ;
//             }
//         }
//         System.out.println(isavailable);
//     }
// }

// add the element to the bottom of the stack :
w

// 
// import java.util.Scanner ;
// import java.util.Stack ;
// public class stack {
//     public static void main(String[] args ){
//         Stack<Integer>s = new Stack<>();
        
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
        
//         Scanner scn = new Scanner(System.in);
//         System.out.println("enter no. of element to add in stack :");
//         int n = scn.nextInt();
//         for(int i= 0 ;i<n ;i++){
//             System.out.println("enter element  :"+i);
//             int element = scn.nextInt();
//             s.push(element); 
//         }
//         System.out.println("enter element to search :");
//         int k = scn.nextInt();
//         boolean isavailable =false ; 
//         while(!s.isEmpty()){
//             // System.out.println(s.pop());
//             int temp = s.pop() ; 
//             if (temp  == k ){
//                 isavailable =  true ;
//             }
//         }
//         System.out.println(isavailable);
//     }
// }