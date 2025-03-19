
import java.util.*;

public class fibonacciBigNumberHandle {
    static long mod = 1000000007; //a prime number(10^9 + 7)
    // if you are dealing with a big number then take modules at each step
    static long fib(int n, long[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1) return dp[n] % mod;
        return dp[n] = ( fib(n-1, dp) + fib(n-2, dp) ) % mod;
    }
    
    static long topDown(int n) {
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
    }

    static long bottomUp(int n) {
        long[] dp2 = new long[n + 1];
        dp2[0] = 0;
        dp2[1] = 1;
        for(int i = 2; i <= n; i++){
            dp2[i] = (dp2[i-1] + dp2[i-2]) % mod;
        }
        return dp2[n];
    }
    public static void main(String[] args) {
        int n = 697;
        System.out.println(topDown(n));
        System.out.println(bottomUp(n));
    }
}
