
import java.util.*;
public class houseRobberTwoMemoization {
    //this question states that the house is circular manner means 0 and n-1 are neighbour/adjacent
    //so we can rob either (0 to n-2) or (1 to n-1) in non adjacent houses

    public static int houseRobber(int start, int n, int[] nums, int[] dp) {
        if(n < start) {
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        //take and call for non adjacent element which is (n-2)
        int take = nums[n] + houseRobber(start, n-2, nums, dp);
        //not take and call for next element which is (n-1)
        int notTake = houseRobber(start, n-1, nums, dp);
        return dp[n] = Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,2}; //output3
        int n = nums.length;
        int start1 = 0, end1 = n-2;
        int start2 = 1, end2 = n-1;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = houseRobber(start1, end1, nums, dp);
        Arrays.fill(dp, -1);
        int res2 = houseRobber(start2, end2, nums, dp);
        System.out.println(Math.max(res,res2));
    }
}
