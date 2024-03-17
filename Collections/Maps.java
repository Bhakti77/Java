//Key-value pair
import java.util.HashMap;
import java.util.Map;

public class Maps{
     public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Two", 222); //Override prev value

        System.out.println(map);

        //Treemap - sorted keys value

        //LinkedHashMap - ordered keys
            }
}