//Collections interface

//List - storing data in sequential manner

/*ArrayList - 1. ArrayList provides us with dynamic arrays in Java. The size of an
ArrayList is increased automatically if the collection grows or shrinks if the objects 
are removed from the collection.*/
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LearnArrayList{

        public static void main(String[] args) {
            
            ArrayList<Integer> student = new ArrayList<>();

            student.add(52);
            student.add(0, 56);
            
            List<Integer> list = new ArrayList<>();
            
            list.add(23);
            list.add(45);

            student.addAll(list);  //adding another collection
        
            System.out.println(student.get(0));
            System.out.println(student.contains(23));
            System.out.println(student);

            student.remove(0);
            System.out.println(student);

            System.out.println(student.isEmpty());

            student.set(1,25); 
            System.out.println(student);

            for(int i = 0;i< student.size();i++){
                System.out.println(student.get(i));
            }

            for (Integer element : student) {

                System.out.println(element);
                
            }

            Iterator  it = (Iterator) student.iterator();

            


        }

}