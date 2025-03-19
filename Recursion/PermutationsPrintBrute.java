package Recursion;
import java.util.*;

public class PermutationsPrintBrute {
    public static void generatePermutation(int i, int n, int[] nums, boolean[] picked, List<Integer> list, List<List<Integer>> ans){
        if(list.size() == n){
            ans.add(new ArrayList<>(list));
            return;       
        }
        for(int index = 0; index < n; index++){
            if(picked[index] == false){
                picked[index] = true;
                list.add(nums[index]);
                generatePermutation(index + 1, n, nums, picked, list, ans);
                list.remove(list.size() - 1);
                picked[index] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] picked = new boolean[n];
        generatePermutation(0,n,nums,picked,list,ans);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
