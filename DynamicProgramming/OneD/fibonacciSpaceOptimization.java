

/*.....................Tabulation to Space Optimization.................................
  1) if there is such type of pattern having [i-1] and [1-2] then we can definitely optimize the space
  2) Replace (i, i-1, and i-2) with (curr, prev1, prev2) respectively.
  3) Store the value of (prev2 <- prev1), (prev1 <- curr)
*/

public class fibonacciSpaceOptimization {
    public static void main(String[] args) {
        int n = 3;
        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;
        for(int i = 2; i <= n; i++){
            curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
