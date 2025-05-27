package Stack.MonotonicStack;
import java.util.*;
//GFG, copy

public class NextGreaterElementGFG {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = arr.length - 1; i >= 0; i--){
            //maintaining desc order in monotonic stack
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                list.add(-1);
            }
            else if(arr[i] < stack.peek()){
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(nextLargerElement(arr));
    }
}
