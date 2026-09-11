package java_development;

class A extends Marks{
    
}
class Marks{
    // int marks = 7 ;   // no access modifier   
    public int marks = 7 ;
}

public class AccessModifiers {
    public static void main(String [] args){
        // int n = 9; 
        Marks obj = new Marks() ; 
        System.out.println(obj.marks) ; 
    }
}
