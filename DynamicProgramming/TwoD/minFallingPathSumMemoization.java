package DynamicProgramming.TwoD;
import java.util.*;
public class minFallingPathSumMemoization {
    /*Question states that falling path start from any element
      in first row and can move in lower, left-lower diagonal,
      right-lower-diagonal
     */
    public static int minSum(int i, int j, int boundary, int[][] nums, int[][] dp){
        //whenever i reaches first row and j is in boundary then returning nums[0][j]
        if(i == 0 && j >= 0 && j < boundary){
            return nums[0][j];
        }

        //whenever i or j crosses boundary then returning max value
        if(i < 0 || j < 0 || j >= boundary){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int upper = minSum(i - 1, j, boundary, nums, dp);
        int leftUpperDiagonal = minSum(i - 1, j - 1, boundary, nums, dp);
        int rightUpperDiagonal = minSum(i - 1, j + 1, boundary, nums, dp);
        return dp[i][j] = nums[i][j] + Math.min(upper, Math.min(leftUpperDiagonal, rightUpperDiagonal));
    }
    public static void main(String[] args) {
        int[][] nums = {{2,1,3}, {6,5,4}, {7,8,9}};
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        //starting from last row for every possible element and storing min value
        int minPath = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int res = minSum(n-1, i, n, nums, dp);
            minPath = Math.min(res, minPath);
        }
        System.out.println(minPath);
    }
}
