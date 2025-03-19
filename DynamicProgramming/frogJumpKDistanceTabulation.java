package DynamicProgramming;

public class frogJumpKDistanceTabulation {
    public static void main(String[] args) {
        int k = 3, nums[]= {10, 30, 40, 50, 20};
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i < n; i++){                      //i loop for recursive call
            int minValue = Integer.MAX_VALUE;            
            for(int j = 1; j <= k; j++){                 //j loop for the loop in recursive function
                if(j <= i){
                    int jumpValue = dp[i-j] + Math.abs(nums[i] - nums[i-j]);
                    minValue = Math.min(minValue,jumpValue);
                }
            }
            dp[i] = minValue;
        }
        System.out.println(dp[n-1]);
    }
}
