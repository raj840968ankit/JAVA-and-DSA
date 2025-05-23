package Stack;
import java.util.*;
public class ImplementStackUsingArrays {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(10);
        stack.push(27);
        stack.push(5);
        stack.push(2);
        stack.display();
    }
}


class ArrayStack {
    ArrayList<Integer> list;
    public ArrayStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int popped = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return popped;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        if(list.size() == 0){
            return true;
        }
        return false;
    }
    public void display(){
        System.out.print("Top -> ");
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}