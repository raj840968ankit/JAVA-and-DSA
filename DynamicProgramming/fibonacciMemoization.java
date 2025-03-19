package DynamicProgramming;
import java.util.*;

/*.....................Recursion to Memoization.................................
  1) Identify the changing Parameters
  2) no of parameter changing = no of dimension of DP array
  3) store the value in DP array when return statement is being called
  4) Check for the values in DP array for given recursive call
 */
 
public class fibonacciMemoization {
    public static int fib(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){                                //memoization
            return dp[n];
        }
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n, dp));
    }
}
