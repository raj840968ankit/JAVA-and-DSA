package Recursion;
import java.util.*;
public class susbetSum2 {
    public static void subset2(int i, int n, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int j = i; j < n ; j++){
            if(j > i && nums[j] == nums[j-1]){
                continue;
            }
            list.add(nums[j]);
            subset2(j+1,n,nums,list,ans);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset2(0,n,nums,list,ans);
        System.out.print("[");
        for(List<Integer> i : ans){
            System.out.print(i + ",");
        }
        System.out.print("]");
    }
}
