

import java.util.Arrays;

public class houseRobberTwoTabulation {
    //this question states that the house is circular manner means 0 and n-1 are neighbour/adjacent
    //so we can rob either (0 to n-2) or (1 to n-1) in non adjacent houses
    public static int houseRobber(int start, int n, int[] nums, int[] dp) {
        dp[start] = nums[start];
        for(int i = start + 1; i <= n; i++){
            int take = nums[i];
            if(i > start + 1){
                take = nums[i] + dp[i - 2];
            }
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] nums = {2,3,2}; //output3
        int n = nums.length;
        int start1 = 0, end1 = n-2;
        int start2 = 1, end2 = n-1;
        int[] dp = new int[n];
        int res = houseRobber(start1, end1, nums, dp);
        Arrays.fill(dp, 0);
        int res2 = houseRobber(start2, end2, nums, dp);
        System.out.println(Math.max(res,res2));
    }
}
