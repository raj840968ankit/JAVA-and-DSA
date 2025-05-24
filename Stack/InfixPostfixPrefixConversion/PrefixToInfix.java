package Stack.InfixPostfixPrefixConversion;

import java.util.*;

public class PrefixToInfix {
    static String preToInfix(String exp) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        //traversing from backward
        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);
            //if any operand encounter then add it to stack
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                stack.push(String.valueOf(ch));
            }
            //if any operator encounter then pop two top element of stack, add operator between them and wrap with braces '()'
            else{
                int count = 2;
                List<String> list = new ArrayList<>();
                while(!stack.isEmpty() && count != 0){
                    list.add(stack.pop());
                    count--;
                }
                StringBuilder sb = new StringBuilder("");
                //wrapping around braces after applying operator between the operands
                sb.append("(" + list.get(0) + ch + list.get(1) + ")");
                stack.push(sb.toString());
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String s = "*+PQ-MN";
        System.out.println(preToInfix(s));
    }
}
