package Queue;

import java.util.*;

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(140);
        queue.enqueue(50);
    }
}

class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void enqueue(int x) {
        st1.push(x);
    }
    
    public int dequeue() {
        if(st1.isEmpty()){
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        } 

        int popped = st2.pop();

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return popped;
    }
    
    public int peek() {
        if(st1.isEmpty()){
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        int peek = st2.peek();

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}