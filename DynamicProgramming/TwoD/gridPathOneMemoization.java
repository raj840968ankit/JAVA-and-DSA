package DynamicProgramming.TwoD;
import java.util.*;
public class gridPathOneMemoization {
    public static int possiblePath(int m, int n, int[][] dp){
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1) return dp[m][n];
        int up = 0;
        int left = 0;
        if(m - 1 >= 0){
            up = possiblePath(m - 1, n, dp);
        }
        if(n - 1 >= 0){
            left = possiblePath(m, n - 1, dp);
        }
        return dp[m][n] = up + left;
    }
    public static void main(String[] args) {
        int m = 3, n = 2;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        } 
        int res = possiblePath(m - 1, n - 1, dp);
        System.out.println(res);
    }
}
