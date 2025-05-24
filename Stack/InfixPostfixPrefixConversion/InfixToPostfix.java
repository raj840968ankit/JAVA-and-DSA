package Stack.InfixPostfixPrefixConversion;

import java.util.ArrayDeque;

public class InfixToPostfix {
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
    public static String infixToPostfix(String s) {
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
                stack.pop();  //for removing '(' after appending to answer
            }
            //if any operator encounter
            else{
                //until priority of ch <= priority of top of stack then pop and add it to answer
                while(!stack.isEmpty() && (priority(ch) <= priority(stack.peek()))){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        //add the remaining operator in stack to answer
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
    }
}
