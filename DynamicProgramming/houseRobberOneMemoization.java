package DynamicProgramming;
import java.util.*;
public class houseRobberOneMemoization {
    public static int houseRobber(int n, int[] nums, int[] dp) {
        if(n < 0) {
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        //take and call for non adjacent element which is (n-2)
        int take = nums[n] + houseRobber(n-2, nums, dp);
        //not take and call for next element which is (n-1)
        int notTake = houseRobber(n-1, nums, dp);
        return dp[n] = Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = houseRobber(n-1, nums, dp);
        System.out.println(res);
    }
}
