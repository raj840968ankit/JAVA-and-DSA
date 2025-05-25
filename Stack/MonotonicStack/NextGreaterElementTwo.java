package Stack.MonotonicStack;
import java.util.*;
//leetcode 503

public class NextGreaterElementTwo {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //running the loop assuming double the array
        //where right half part assuming virtual array
        for(int i = (2 * n - 1); i >= 0; i--){
            // Maintain decreasing order in the stack
            while(!stack.isEmpty() && nums[i % n] >= stack.peek()){
                stack.pop();
            }
            //answer is adding to result only when i point to original array
            if(i < n){
                if(stack.isEmpty()){
                    res[i] = -1;
                }
                else if(nums[i] < stack.peek()){
                    res[i] = stack.peek();
                }
            }
            stack.push(nums[i % n]);
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int[] result = nextGreaterElements(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
