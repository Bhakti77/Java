import java.util.*;
//Unordered
//no duplicates
public class Sets {
    public static void main(String[] args) {
        
        //Hashset - 
        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(30);
        set.add(40);
        set.add(210);
        set.add(10);
        set.add(20);
        set.add(20);

        set.remove(40);

        System.out.println(set);

        System.out.println(set.contains(20));

        System.out.println(set.size());

        //LINKEDHASHSET - it will be ordered

        Set<Integer> linkedhashSet = new LinkedHashSet<>();
         linkedhashSet.add(56);
         linkedhashSet.add(85);
         System.out.println(linkedhashSet);
        //TREESET - sorted set

        Set<Integer> treeset = new TreeSet<>();

        treeset.add(23);
        treeset.add(25);
        treeset.add(2355);
        treeset.add(2553);
        treeset.add(253);
        treeset.add(74);

        System.out.println(treeset); //op -[23, 25, 74, 253, 2355, 2553]
        




        

    }
    
}
