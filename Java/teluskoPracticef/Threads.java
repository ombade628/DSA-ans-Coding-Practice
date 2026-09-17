package java_development;

// class Hi extends Thread{
//     public void run(){
//         for(int i  = 0 ; i<10 ; i++) System.out.println("hi");
//     }
// }
// class Hello extends Thread {
//     public void run(){
//         for(int i  = 0 ; i<10 ; i++) System.out.println("hello");
//     }
// }

// public class Threads {
//     public static void main(String[] args) {
//         Hi hi = new  Hi() ; 
//         Hello hello = new Hello() ; 
//         hi.start() ; 
//         hello.start() ;

//         // int n = 0; 
//         // try{
//         //     n = 1/0 ; 
//         // }
//         // catch(Exception e) e.p ;  

//     }
// }


// using lamda expressiong and runnable class ; 
public class Threads{
    public static void main(String[] args){
        Runnable r1 = ()-> {
            for(int i=0 ; i<10; i++){
                System.out.println("hi") ; 
                try{
                    Thread.sleep(2) ; 
                }catch(Exception e){
                    // e.printStackTrace(e);
                    System.out.print(e) ; 
                }
            }
        };
        Runnable r2 = ()-> {
            for(int i=0 ; i<10; i++){
                System.out.println("hello") ; 
                try{
                    Thread.sleep(2) ; 
                }catch(Exception e){
                    // e.printStackTrace(e);
                    System.out.print(e) ; 
                }
            }
        };
        Thread t1 = new Thread(r1) ; 
        Thread t2 = new Thread(r2) ; 
        t1.start(); 
        t2.start(); 

    }
}