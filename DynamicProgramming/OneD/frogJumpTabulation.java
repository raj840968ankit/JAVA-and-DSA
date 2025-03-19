

import java.util.Arrays;

/*.....................Memoization to Tabulation.................................
  1) Identify the base case and initialize in DP array because it is bottom-up approach
  2) Look for the recursion call range (from where to where)
     2.1) Declare a for loop (from where to where)
     2.2) Replace recursion calls with DP array and leave everything same
 */

public class frogJumpTabulation {
    public static void main(String[] args) {
        int[] nums = {20,30,40,20};
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;         //it is the base case
        for(int i = 1; i < nums.length; i++){
            int oneStep = dp[i-1] + Math.abs(nums[i] - nums[i-1]);   //replaced recursive call with dp array
            int twoStep = Integer.MAX_VALUE;
            if(i >= 2){
                twoStep = dp[i-2] + Math.abs(nums[i] - nums[i-2]);
            }
            //storing the answer same type as in recursion return statement
            dp[i] = Math.min(oneStep, twoStep);
        }
        System.out.println(dp[n-1]);
    }
}
