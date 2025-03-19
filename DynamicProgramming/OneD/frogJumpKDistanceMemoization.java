
import java.util.*;
public class frogJumpKDistanceMemoization {
    public static int jumpKDistance(int n, int k, int[] nums, int[] dp){
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int minValue = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            if(i <= n){
                int jumpValue = jumpKDistance(n-i, k, nums, dp) + Math.abs(nums[n] - nums[n-i]);
                minValue = Math.min(minValue,jumpValue);
            }
        }
        return dp[n] = minValue;
    }
    public static void main(String[] args) {
        int k = 3, nums[]= {10, 30, 40, 50, 20};
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = jumpKDistance(n-1, k, nums, dp);
        System.out.println(res);
    }
}
