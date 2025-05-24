package Stack.InfixPostfixPrefixConversion;

import java.util.ArrayDeque;

public class InfixToPrefix {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder("");
        //reversing string and replacing '(' with ')' and vice versa
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
                sb.append(')');
            }
            else if(ch == ')'){
                sb.append('(');
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static int priority(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '^'){
            return 3;
        }
        return -1;
    }

    public static String infixToPrefix(String s){
        s = reverse(s);
        StringBuilder sb = new StringBuilder("");
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //if any operand encounter then add it to answer
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
            // if any '(' encounter then just push it to stack
            else if(ch == '('){
                stack.push(ch);
            }
            // if any ')' encounter then pop top of the stack until top == '('
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            //if any operator encounter
            else{
                //i have used '<=' because stack can't contain multiple '^' during conversion
                if(ch == '^'){
                    while(!stack.isEmpty() && priority(ch) <= priority(stack.peek())){
                        sb.append(stack.pop());
                    }
                    stack.push(ch);
                }
                else{
                    while(!stack.isEmpty() && priority(ch) < priority(stack.peek())){
                        sb.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }
        }
        //add the remaining operator in stack to answer
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        //again reverse the string and return the answer
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "F+D-C*(A+B)";
        System.out.println(infixToPrefix(s));
    }
}
