package DynamicProgramming.DpOnSubsequences;

public class partitionEqualSubsetSumTabulation {
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
        boolean[][] dp = new boolean[n][halfSum + 1];
        //base case 1 :- for every index if target is 0 then it contain true value
        for(int i = 0; i < n; i++){
            dp[i][0] = true;
        }

        // Base Case 2: If first element is within sum range, mark it as true
        if (nums[0] <= halfSum) {
            dp[0][nums[0]] = true;
        }
        
        //here we have considered for i = 0 and halfSum = 0 in base case so we'll start loop from 1
        for(int i = 1; i < n; i++){
            for(int target = 1; target < halfSum + 1; target++){
                boolean take = false;
                if(target >= nums[i]){
                    take = dp[i - 1][target - nums[i]];
                }
                boolean notTake = dp[i - 1][target];
                dp[i][target] = take || notTake;
            }
        }
        System.out.println(dp[n - 1][halfSum]);
    }
}
