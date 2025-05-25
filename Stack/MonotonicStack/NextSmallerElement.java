package Stack.MonotonicStack;
import java.util.*;
//coding ninjas

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = arr.size() - 1; i >= 0; i--){
            //maintaining ascending monotonic stack
            while(!stack.isEmpty() && arr.get(i) <= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }
            else if(arr.get(i) > stack.peek()){
                list.add(stack.peek());
            }
            stack.push(arr.get(i));
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 4, 3));
        System.out.println(nextSmallerElement(arr));
    }
}
