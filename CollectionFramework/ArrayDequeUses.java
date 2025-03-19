import java.util.*;
public class ArrayDequeUses {
    public static void main(String[] args) {
        // as Queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.poll());
        System.out.println("queue : front->"+queue+"->rear");

        //as Deque or doubly ended queue
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerFirst(20);
        deque.offerLast(30);
        System.out.println(deque.pollLast());
        System.out.println("deque : "+deque);

        //as stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println("stack : top->"+stack);
    }
}
