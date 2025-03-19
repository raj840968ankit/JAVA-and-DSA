package BitManipulation;

import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int subsets = 1<<n;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int subset = 0; subset < subsets; subset++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((subset & (1 << i)) != 0){
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        for(ArrayList<Integer> li : ans){
            System.out.println(li);
        }
    }
}
