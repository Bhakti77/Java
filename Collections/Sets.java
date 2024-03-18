import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//Unordered
//no duplicates
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        

        //HASHSET
        Set<Integer> set = new HashSet<Integer>();

        set.add(56);
        set.add(88);
        set.add(47);
        set.add(14);
        set.add(21);
        set.add(21);
        set.add(21);
        set.add(21);
        set.add(21);


        System.out.println(set);

        System.out.println(set.contains(21));

        //LINKEDHASHSET
        //Order of elements will be maintained as they inserted

        Set<Integer> lhset = new LinkedHashSet<Integer>();

        lhset.add(56);
        lhset.add(85);
        lhset.add(56);
        lhset.add(98);

        System.out.println(lhset);

        //TREESET
        //Elements will be sorted 
        Set<Integer> tset = new TreeSet<>();

        tset.add(56);
        tset.add(56);
        tset.add(98);
        tset.add(14);
        tset.add(1);

        System.out.println(tset);

        Set<String> treeset = new TreeSet<>();

        treeset.add("Bhakti");
        treeset.add("Shahbaz");
        treeset.add("Ankita");
        treeset.add("Ankita");
        treeset.add("arpita");
        

        System.out.println(treeset);
        







        


    }
}
