package java_development;

// import org.w3c.dom.css.Counter;

class Counter{
    int count ; 
    public synchronized void increment( ){
        count++ ; 
    }
}
public class SynchronizedThread {

    public static void main(String[] args)throws InterruptedException{
        // int num = 0 ; 
        Counter c = new Counter();
        Runnable r1 = ()-> {
            for(int i=0 ; i<10000; i++){
                c.increment() ;  
                try{
                    Thread.sleep(2) ; 
                }catch(Exception e){
                    // .printStackTrace(e);
                    System.out.print(e) ; 
                }
            }
        };
        Runnable r2 = ()-> {
            for(int i=0 ; i<10000; i++){
                // System.out.println("hello") ;
                c.increment();  
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
        t1.join() ; 
        t2.join() ;
        System.out.println(c.count) ; 
    }
}
