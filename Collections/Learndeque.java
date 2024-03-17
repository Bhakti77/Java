import java.util.ArrayDeque;

public class Learndeque{

    public static void main(String[] args) {
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(23);
        dq.offerFirst(89);
        dq.offerLast(65);
        dq.offerFirst(55);

        System.out.println(dq);

        dq.pollFirst();

        System.out.println(dq);

        System.out.println(dq.peekFirst());

        dq.pollLast();

        System.out.println(dq);

    }
}