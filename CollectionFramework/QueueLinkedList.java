import java.util.*;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();  //implementation of queue using LinkedList
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        while(!queue.isEmpty()){                   //while queue is not empty
            System.out.println(queue.poll());
        }
    }
}
