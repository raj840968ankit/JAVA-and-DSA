package Recursion;
import java.util.*;
public class reverseStack {
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int data = s.pop();
        reverse(s);
        insertAtBottom(data,s);
    }
    public static void insertAtBottom(int data, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int bottomData = stack.pop();
        insertAtBottom(data,stack);
        stack.push(bottomData);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
