package DynamicProgramming.TwoD;


public class gridMinimumSumTabulation {
    public static void main(String[] args) {
        int[][] nums = {{1,3,1}, {1,5,1}, {4,2,1}};
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = nums[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) continue;
                /*if i == 0 || j == 0 then we can't perform operation of up and down
                 so that's why we will store max value at that time as we were doing in memoization base case
                */
                int up = Integer.MAX_VALUE;
                if(i > 0){
                    up = dp[i - 1][j];
                }
                int left = Integer.MAX_VALUE;
                if(j > 0){
                    left = dp[i][j - 1];
                }
                dp[i][j] = nums[i][j] +  Math.min(up , left);
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
