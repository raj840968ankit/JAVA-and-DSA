package DynamicProgramming;

import java.util.Arrays;

/*.....................Recursion to Memoization.................................
  1) Identify the changing Parameters
  2) no of parameter changing = no of dimension of DP array
  3) store the value in DP array when return statement is being called
  4) Check for the values in DP array for given recursive call
 */

public class climbStairsMemoization {
    // climbing stairs gives output same as fibonacci series 1 1 2 3 5 8....and so on
    //But it gives output for n same as n+1 in fibonacci series
    public static int climb(int n, int[] dp){
        if(n == 1) return 1;    /*if there is 1 stair then only one way can be made that is 1*/
        if(n == 2) return 2;    /*if there are 2 stairs then two way can be made that is 1,1 and 2*/
        if(dp[n] != -1){                                //memoization
            return dp[n];
        }
        return dp[n] = climb(n-1, dp) + climb(n-2, dp);
    }
    
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climb(n, dp));
    }
}
