package java_development;

class Human{
    private int age ; 
    private String name ; 
    public int getAge(){
        return age ; 
    }
    public String getName(){
        return name ; 
    }
    public void setAge(int age){
        this.age=  age ; 
    }
    public void setName(String name){
        this.name = name; 
    }

}
public class encapsule {
    public static void main(String[] args) {
        Human h1 = new Human() ; 
        Human h2 = new Human() ;
        Human h3 = new Human() ;
        Human h4 = new Human() ;
        Human h5 = new Human() ;
        Human h6 = new Human() ;
        Human h7 = new Human() ;
        // Human h1 = new Human() ;
        h1.setAge(22);
        h1.setName("om");
        h2.setAge(34);
        h2.setName("Rahul");
        h3.setAge(24);
        h3.setName("anand");
        h4.setAge(25);
        h4.setName("Ananya");
        h5.setAge(28);
        h5.setName("Kartik");
        h6.setAge(12);
        h6.setName("Adesh");
        h7.setAge(23);
        h7.setName("Aditi");
        Human[] arr = new Human[7] ; 
        arr[0] = h1 ; 
        arr[1] = h2 ; 
        arr[2] = h3 ; 
        arr[3] = h4 ; 
        arr[4] = h5 ; 
        arr[5] = h6 ; 
        arr[6] = h7 ; 
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i].getName()+":"+arr[i].getAge());
        }
    }
}
