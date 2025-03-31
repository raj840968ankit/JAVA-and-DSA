package DynamicProgramming.DpOnSubsequences;

public class partitionEqualSubsetSumMemoization {
    public static boolean partitionPossible(int i, int halfSum, int[] nums, Boolean[][] dp){
        if(halfSum == 0) return true;
        if(i == 0) return (halfSum - nums[i] == 0);
        if(dp[i][halfSum] != null) return dp[i][halfSum];
        boolean take = false;
        if(halfSum >= nums[i]){
            take = partitionPossible(i - 1, halfSum - nums[i], nums, dp);
        }
        boolean notTake = partitionPossible(i - 1, halfSum, nums, dp);
        return dp[i][halfSum] = take || notTake;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }
        //if totalSum is even the we can divide the array into two equal subset
        //if totalSum is odd the we can't divide the array into two equal subset

        //since we are finding for two equal subset we will find for sum (totalSum / 2)
        //if we find any subset which is giving sum as (totalSum / 2) then we will return true;
        if(totalSum % 2 != 0){
            System.out.println(false);
            return;
        }
        int halfSum = totalSum/2;
        Boolean[][] dp = new Boolean[n][halfSum + 1];
        boolean res = partitionPossible(n - 1, halfSum, nums, dp);
        System.out.println(res);
    }
}
