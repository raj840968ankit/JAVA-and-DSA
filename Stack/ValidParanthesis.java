package Stack;
import java.util.ArrayDeque;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        if((s.length() % 2) != 0 ){
            return false;
        }
        char popped = ' ';
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                count++;
                continue;
            }
            if(!stack.isEmpty()) {
                popped = stack.pop();
            }
            count--;
            if(count < 0){
                return false;
            }
            if(ch == ')'){
                if(popped == '('){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(ch == '}'){
                if(popped == '{'){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                if(popped == '['){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
