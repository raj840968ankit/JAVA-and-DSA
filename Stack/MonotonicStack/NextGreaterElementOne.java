package Stack.MonotonicStack;
import java.util.*;
//leetcode 496, copy

public class NextGreaterElementOne {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //for storing element and corresponding next greater
        Map<Integer,Integer> map = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //start looping in nums2 and arrange element in monotonic stack in desc order
        for(int i = 0; i < nums2.length; i++){
            // Maintain decreasing order in the stack
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        //now we will check every element in nums1 is present in map or not
        //if it is present then that will contain corresponding next greater
        //if not then add -1 to answer
        for(int  i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                nums1[i] = map.get(nums1[i]);
            }
            else{
                nums1[i] = -1;
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = nextGreaterElement(nums1, nums2);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
