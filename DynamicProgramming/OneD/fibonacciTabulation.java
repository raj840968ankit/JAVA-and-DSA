

/*.....................Memoization to Tabulation.................................
  1) Identify the base case and initialize in DP array because it is bottom-up approach
  2) it is obvious that 1D DP has 1 parameter changing in recursion then always follow:-
     2.1) there will be 1 loop for dp array only for corresponding changing parameter and that loop will run from (baseCase < i < n).
        2.1.1) rest of the things will be copied same as recursion function.
        2.1.2) Replace recursion calls with DP array and leave everything same
 */

public class fibonacciTabulation {
    // climbing stairs gives output same as fibonacci series 1 1 2 3 5 8....and so on
    //But it gives output for n same as n+1 in fibonacci series
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
