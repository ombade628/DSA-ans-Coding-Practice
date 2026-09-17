package java_development;

class O {
    public void helloFriend(){
        System.out.println("hello :") ; 
    }
}
class P extends O{
    @Override
    public void helloFriend(){
        System.out.println("in B ") ; 
    }
}

public class Annotations {
    public static void main(String[] args) {
        P obj = new P( ) ; 
        obj.helloFriend();
    }
}
