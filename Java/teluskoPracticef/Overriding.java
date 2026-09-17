package java_development; 
class Calc{
    
    public int add(int a, int b){
        return a+b ; 
    }
}
class AdvCalc extends Calc {
    // @Override
    public  int add(int a, int b ){
        return a+b+1 ; 
     }
}

public class Overriding {
    public static void main(String[] args) {
        Calc obj = new AdvCalc() ; 
        int x = obj.add(3,4) ; 
        System.out.print(x);
    }
}
