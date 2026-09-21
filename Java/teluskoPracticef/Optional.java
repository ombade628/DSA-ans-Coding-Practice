package java_development;
import java.util.* ; 
public class Optional {
    public static void main(String[] args) {
        
        
        List<String> list1 =  Arrays.asList("Om" , "Navin", "Laxmi", "Pardh");
        List<String> list2 =  Arrays.asList("Om" , "Navin", "Lakhan", "Pardh");
        String name1 = list1.stream().filter(str->str.contains("x")).findFirst().orElse("Not Found") ; 
        String name2 = list2.stream().filter(str->str.contains("x")).findFirst().orElse("Not Found") ; 
        System.out.println(name1) ; 
        System.out.println(name2) ; 
    }
}

