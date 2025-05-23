package Queue;
import java.util.*;
public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(140);
        queue.enqueue(50);
        queue.display();
        System.out.println(queue.deque());
    }
}
class ArrayQueue {
    ArrayList<Integer> list;
    public ArrayQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(int x) {
       list.add(x);
    }

    public int deque() {
      return list.remove(0);
    }

    public int peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        if(list.size() == 0) return true;
        return false;
    }
    public void display(){
        System.out.print("Front -> ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(" -> Rear");
        System.out.println();
    }
}