import java.util.*;
public class myPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq= new PriorityQueue<>();
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);            //by default lesser valued item will be deleted
        pq.offer(30);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
