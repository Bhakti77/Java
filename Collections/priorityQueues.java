

/*A PriorityQueue is used when the objects are supposed to be processed based on the priority. 
It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the 
queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.*/

import java.util.Comparator;
import java.util.PriorityQueue; 


public class priorityQueues {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(45);
        pq.offer(90);
        pq.offer(44);
        pq.offer(33);
        pq.offer(78);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());


    }
    
}
