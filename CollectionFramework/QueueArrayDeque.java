import java.util.ArrayDeque;

public class QueueArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> deque= new ArrayDeque<>();  //doubly ended queue(deque)
        deque.offer(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}