package DynamicProgramming;
import java.util.*;

/*.....................Recursion to Memoization.................................
  1) Identify the changing Parameters
  2) no of parameter changing = no of dimension of DP array
  3) store the value in DP array when return statement is being called
  4) Check for the values in DP array for given recursive call
 */
 
public class frogJumpMemoization {
    //frog can take either 1 jump or 2 jump 
    //calculate the min cost to reach the end
    public static int jump(int n, int[] nums, int[] dp){
        if( n == 0) return 0;
        if(dp[n] != -1){
            return dp[n];
        }
        int oneStep = jump(n-1, nums, dp) + Math.abs(nums[n] - nums[n-1]);
        int twoStep = Integer.MAX_VALUE;
        if(n >= 2){
            twoStep = jump(n-2, nums, dp) + Math.abs(nums[n] - nums[n-2]);;
        }
        return dp[n] = Math.min(oneStep,twoStep);
    }
    public static void main(String[] args) {
        int[] nums = {20,30,40,20};
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int res = jump(nums.length - 1, nums, dp);
        System.out.println(res);
    }
}
