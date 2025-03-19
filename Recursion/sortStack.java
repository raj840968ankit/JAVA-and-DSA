package Recursion;
import java.util.*;
public class sortStack {
    public static void sort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int data = stack.pop();
        sort(stack);
        sortFromTop(data,stack);
    }
    public static void sortFromTop(int element, Stack<Integer> stack){
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        sortFromTop(element,stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
