package Recursion;
import java.util.*;
public class subsetSum1 {
    public static void subsetList(int i, int n, int sum, int[] nums, ArrayList<Integer> list){
        if(i >= n){
            list.add(sum);
            return;
        }
        //take
        subsetList(i+1, n, sum+nums[i], nums, list);
        //not take
        subsetList(i+1, n, sum, nums, list);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        //.....................recursive subsequences approach.....................
        // subsetList(0, n, 0, nums, list);
        // Collections.sort(list);

        //.....................power set approach..................................
        int subset = 1<<n;
        for(int i = 0; i < subset; i++){
            int sum = 0;
            for(int j = 0; j < n ; j++){
                if((i & (1 << j)) != 0){
                    sum += nums[j];
                }
            }
            list.add(sum);
        }
        System.out.println(list);
        
    }
}
