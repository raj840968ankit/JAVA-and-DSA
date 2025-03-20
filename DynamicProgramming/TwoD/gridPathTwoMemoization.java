package DynamicProgramming.TwoD;
import java.util.*;
public class gridPathTwoMemoization {
    /*here we don't need visited array to keep track because 
    it can move in 2 direction only. Not in 4 direction as in grid path recursion problem.
    */
    public static int possiblePath(int m, int n, int[][] nums, int[][] dp){
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1) return dp[m][n];
        int up = 0;
        int left = 0;
        if(m - 1 >= 0 && nums[m - 1][n] != 1){
            up = possiblePath(m - 1, n, nums, dp);
        }
        if(n - 1 >= 0 && nums[m][n - 1] != 1){
            left = possiblePath(m, n - 1, nums, dp);
        }
        return dp[m][n] = up + left;
    }
    public static void main(String[] args) {
        int[][] nums = {{0,0,0}, {0,1,0}, {0,0,0}};
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        int res = possiblePath(m - 1, n - 1, nums, dp);
        System.out.println(res);
    }
}
