package java_development;
enum Status{
    Running, Failed, Pending, Success ;
}
enum LapTop{
    Mac(100000), XPS(80000), Asus(70000), Hp(60000) ;
    private int price;  
     
    private LapTop(int price){
        this.price=  price ; 
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enumeration {
    public static void main(String[] args){
        // int i = 9 ; ms.Running ; 
        // System.out.println(s) ; 
        // Status s2 = Status.Success ; 
        // System.out.println(s.ordinal()) ; 
        // Status[] s3 = Status.values() ; 
        // for(Status t :s3 )System.out.println(t+":"+t.ordinal()) ; 
         

        // // if-else and switch  with enums :
        // if(s == Status.Pending) System.out.println("All Good:");
        // else System.out.println("Not Good:") ; 


        LapTop lap  = LapTop.Asus ; 
        System.out.println(lap.getPrice())  ; 
        for(LapTop lap1 : LapTop.values()) {
            System.out.println(lap1+":" + lap.getPrice()); 
        }
    }
}
