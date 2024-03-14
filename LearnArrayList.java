//Collections interface

//List - storing data in sequential manner

/*ArrayList - 1. ArrayList provides us with dynamic arrays in Java. The size of an
ArrayList is increased automatically if the collection grows or shrinks if the objects 
are removed from the collection.*/
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<String> StudentName = new ArrayList<>(); //no need to define array size
        System.out.println(StudentName);
        System.out.println(StudentName.size());
        StudentName.add("Bhakti");

        System.out.println(StudentName);
        System.out.println(StudentName.size());
        StudentName.add(0,"Rani");
        System.out.println(StudentName);
        
        System.out.println(StudentName.get(1));
        StudentName.remove(String.valueOf("Bhakti"));
        System.out.println(StudentName);
        
        //StudentName.clear();
        System.out.println(StudentName.contains("Rani")); //False

        for(int i = 0;i<StudentName.size();i++)
        {
            System.out.println(StudentName.get(i));
        }
    }
}
//Set - unique values
//Queue - 