import java.util.HashMap;
public class hash_map {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(1,"india");
        map.put(2,"BRAzil");
        map.put(3,"thailand");

        System.out.println(map);
        System.out.println(map.get(1));
        // map.remove(2);
        // System.out.println(map);
        // map.clear();
        // System.out.println(map);
        
        System.out.println(map.size());

            for(int i : map.keySet()){
                System.out.println(i + "  "  + map.get(i));
            }






    }
}
