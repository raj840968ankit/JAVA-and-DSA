package DynamicProgramming.TwoD;

public class gridPathTwoTabulation {
    /*here we don't need visited array to keep track because 
    it can move in 2 direction only. Not in 4 direction as in grid path recursion problem.
    */
    public static void main(String[] args) {
        int[][] nums = {{0,0,0}, {0,1,0}, {0,0,0}};
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //base case
                if(i == 0 && j == 0){
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i - 1 >= 0 && nums[i - 1][j] != 1){
                    up = dp[i - 1][j];
                }
                if(j - 1 >= 0 && nums[i][j - 1] != 1){
                    left = dp[i][j - 1];
                }
                dp[i][j] = up + left;
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
