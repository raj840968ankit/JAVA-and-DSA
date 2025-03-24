package DynamicProgramming.threeD;
import java.util.*;
public class NinjaAndFriendsMemoization {
    //Notes in copy
    public static int maxPick(int i, int j1, int j2, int m, int n, int[][] grid, int[][][] dp){
        //out of bound base case must be written first
        if(j1 < 0 || j1 >= n || j2 < 0 || j2 >= n){
            return Integer.MIN_VALUE;
        }
        //base case when it reaches last row
        if(i == m - 1){
            if(j1 == j2) return grid[m-1][j1];  // when both robot is at same cell then only one can pick chocolates
            if(j1 != j2) return grid[m-1][j1] + grid[m-1][j2]; //otherwise both cell chocolates will considered
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        int max = 0;
        /*for each movement of robot1, robot2 can make three movement.
          direction of robot in next row (i+1) is in (-1, 0, 1) columns
        */
        for(int d1 = -1; d1 <= 1; d1++){
            for(int d2 = -1; d2 <= 1; d2++){  /* at every iteration it is considering max(sum of two cells) (i+1, j1) and (i+1, j2)*/  
                int value = 0;                
                if(j1 == j2) value = grid[i][j1]; //when robots are standing at same cell
                else value = grid[i][j1] + grid[i][j2]; // when robots are standing at different cell
                value = value + maxPick(i+1, j1+ d1, j2+ d2, m, n, grid, dp);
                max = Math.max(max, value);
            }
        }
        return dp[i][j1][j2] = max;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,1}, {2,5,1}, {1,5,5}, {2,1,1}};
        int m = grid.length;
        int n = grid[0].length;

        //3 parameters are changing (i, j1, j2) so we will consider 3d dp array
        int[][][] dp = new int[m][n][n];
        for(int[][] i : dp){
            for(int[] j : i){
                Arrays.fill(j, -1);
            }
        }
        int res = maxPick(0, 0, n-1, m, n, grid, dp);
        System.out.println(res);
    }
}
