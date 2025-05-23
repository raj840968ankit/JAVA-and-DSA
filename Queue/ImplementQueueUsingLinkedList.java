package Queue;

import java.util.*;

public class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(140);
        queue.enqueue(50);
        queue.display();
    }
}

class LinkedListQueue {
    LinkedList<Integer> ll;
    public LinkedListQueue() {
        ll = new LinkedList<>();
    }

    public void enqueue(int x) {
       ll.addLast(x);
    }

    public int deque() {
      return ll.removeFirst();
    }

    public int peek() {
       return ll.get(0); 
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }
    public void display(){
        System.out.print("Front -> ");
        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.print(" -> Rear");
        System.out.println();
    }
}
