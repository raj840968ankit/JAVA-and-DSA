package DynamicProgramming;

public class houseRobberOneTabulation {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};  //output = 4
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int take = nums[i];
            //if it will take (i-2) only when the (i > 1)
            if(i > 1){
                take = nums[i] + dp[i-2];
            }
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        System.out.println(dp[n-1]);
    }
}
