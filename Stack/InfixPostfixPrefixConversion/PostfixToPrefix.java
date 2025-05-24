package Stack.InfixPostfixPrefixConversion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PostfixToPrefix {
    static String postToPre(String exp) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            //if any operand encounter then add it to stack
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                stack.push(String.valueOf(ch));
            }
            //if any operator encounter then pop two top element of stack, add operator just behind the operands and push to stack
            else{
                int count = 2;
                List<String> list = new ArrayList<>(); 

                while(!stack.isEmpty() && count != 0){
                    list.add(stack.pop());
                    count--;
                }

                StringBuilder sb = new StringBuilder("");
                //adding operator just before stack two top elements
                sb.append(ch + list.get(1) + list.get(0));
                stack.push(sb.toString());
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        System.out.println(postToPre(s));
    }
}
