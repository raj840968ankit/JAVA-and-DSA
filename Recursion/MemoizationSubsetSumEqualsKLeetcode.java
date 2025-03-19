package Recursion;
import java.util.*;
public class MemoizationSubsetSumEqualsKLeetcode {
    public static int noOfSubSetsEqualsK(int i, int n, int sum, int target, int[] nums, int[][] dp){
        if(i >= n){
            return sum == target ? 1 : 0;
        }
        if(dp[i][sum] != -1) return dp[i][sum];
        int take = noOfSubSetsEqualsK(i+1 , n , sum + nums[i], target, nums, dp);
        int notTake = noOfSubSetsEqualsK(i+1 , n , sum , target, nums, dp);
        return dp[i][sum] = take + notTake;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,1,4,3};
        int target = 10;
        int n = nums.length;
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }
        int[][] dp = new int[n+1][totalSum + 1]; 
        for(int[] i : dp) Arrays.fill(i, -1);
        int result= noOfSubSetsEqualsK(0, n ,0 , target, nums, dp);
        System.out.println(result);
    }
}
