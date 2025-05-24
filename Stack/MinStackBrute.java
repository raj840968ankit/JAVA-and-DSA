package Stack;

import java.util.Stack;

class Pair{
    int val;
    int min;
    Pair(int val, int min){
        this.val = val;
        this.min = min;
    }
    public int getVal(){
        return this.val;
    }
    public int getMin(){
        return this.min;
    }
}
public class MinStackBrute {
    Stack<Pair> stack;
    int min;
    public MinStackBrute() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair(val, val));
            return;
        }
        min = Math.min(stack.peek().getMin(), val);
        stack.push(new Pair(val, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getVal();
    }
    
    public int getMin() {
        return stack.peek().getMin();
    }
    public static void main(String[] args) {
        MinStackBrute st = new MinStackBrute();
        st.push(-2);
        st.push(0);
        st.push(-3);
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
    }
}
