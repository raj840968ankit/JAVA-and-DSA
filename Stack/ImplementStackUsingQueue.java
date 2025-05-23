package Stack;
import java.util.*;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(27);
        stack.push(5);
        stack.push(2);
    }
} 

class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        if(queue.size() == 0){
            queue.offer(x);
            return;
        }
        queue.offer(x);
        for(int i = 0; i < queue.size() - 1; i++){
            queue.offer(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}