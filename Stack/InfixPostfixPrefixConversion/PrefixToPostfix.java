package Stack.InfixPostfixPrefixConversion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PrefixToPostfix {
    static String preToPost(String exp) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);
            //if any operand encounter then add it to stack
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                stack.push(String.valueOf(ch));
            }
            //if any operator encounter then pop two top element of stack, add operator just after the operands and push to stack
            else{
                int count = 2;
                List<String> list = new ArrayList<>(); 

                while(!stack.isEmpty() && count != 0){
                    list.add(stack.pop());
                    count--;
                }

                StringBuilder sb = new StringBuilder("");
                //adding operator just after stack two top elements
                sb.append(list.get(0) + list.get(1) + ch);
                stack.push(sb.toString());
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.println(preToPost(s));
    }
}
