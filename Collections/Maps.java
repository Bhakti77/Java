//Key-value pair
import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(2,"Twenty"); // value will be overrided due to same key
        map.putIfAbsent(6, "six");

        System.out.println(map);
       for(Map.Entry<Integer,String> e: map.entrySet()){

        System.out.println(e.getKey());
        System.out.println(e.getValue());

        //TREEMAP
        //SORTED KEYS

        //LINKEDHASHMAP
        //ORDERED ELEMENTS
        
       }
    }
}