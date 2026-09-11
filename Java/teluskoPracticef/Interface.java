package java_development ;
public class Interface {
    public static void main(String[] args){
        Comput lap = new lap() ; 
        Comput desk = new desk() ; 
        desk.code() ; 
        lap.code() ; 
    }
}
interface Comput{
    void code() ; 
}
class lap implements Comput{
    public void code(){
        System.out.println("running in laptop") ; 
    }
}
class desk implements Comput{
    public void code(){
        System.out.println("running in Desktop") ; 
    }
}
