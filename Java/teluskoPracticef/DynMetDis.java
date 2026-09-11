package java_development;

class Computer{
    public void show(){
        System.out.println("In com show");
    }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("In lap show");
    }
}class Tab extends Computer{
    public void show(){
        System.out.println("In Tab show");
    }
} 

public class DynMetDis {
    public static void main(String[] args) {
        // C obj = new C() ; 
        // obj.show() ; 

        Computer lap = new Computer() ; 
        lap.show() ; 

        lap = new Laptop() ; 
        lap.show() ; 
        
        lap = new Tab() ; 
        lap.show() ; 
    }
}
