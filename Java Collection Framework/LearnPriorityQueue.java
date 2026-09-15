import java.util.*;

public class LearnPriorityQueue{

    public static void main(String[] args){

        // Default Implement Min-Heap 
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());


        // Now Implement Max-Heap 
        Queue<Integer> pq2 = new PriorityQueue<>((a, b)->b - a);

        pq2.add(30);
        pq2.add(40);
        pq2.add(10);
        pq2.add(20);

        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());

    }
}