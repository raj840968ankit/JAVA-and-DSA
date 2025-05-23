package Stack;

import java.util.*;

public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(27);
        stack.push(5);
        stack.push(2);
        stack.display();
    }
}
class LinkedListStack {
    LinkedList<Integer> ll;
    public LinkedListStack() {
        ll = new LinkedList<>();
    }

    public void push(int x) {
       ll.addFirst(x);
    }

    public int pop() {
       return ll.removeFirst();
    }

    public int top() {
        return ll.get(0);
    }

    public boolean isEmpty() {
        return ll.size() == 0;
    }
    public void display(){
        System.out.print("Top -> ");
        for(int i = ll.size() - 1; i >= 0; i--){
            System.out.print(ll.get(i)+" ");
        }
    }
}
