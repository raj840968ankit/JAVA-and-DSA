import java.util.*;
public class stackList {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("3");
        stack.push("6");
        stack.push("4");
        System.out.println(stack); 
        System.out.println("peek = "+stack.peek());   
        System.out.println("popped = "+stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
