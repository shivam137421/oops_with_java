import java.util.*;

public class queue{
    public static void main(String[] args){
        
        
        Queue<Integer> pq = new PriorityQueue<>();
        
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);
        
        System.out.println("PriorityQueue elements: " + pq);

        pq.remove(20);
        System.out.println("After removing 20: " + pq);
        System.out.println("Peek element: " + pq.peek());

        Iterator<Integer> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}