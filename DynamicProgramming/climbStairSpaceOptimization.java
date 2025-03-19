package DynamicProgramming;

/*.....................Tabulation to Space Optimization.................................
  1) if there is such type of pattern having [i-1] and [1-2] then we can definitely optimize the space
  2) Replace (i, i-1, and i-2) with (curr, prev1, prev2) respectively.
  3) Store the value of (prev2 <- prev1), (prev1 <- curr)
*/

public class climbStairSpaceOptimization {
    // climbing stairs gives output same as fibonacci series 1 1 2 3 5 8....and so on
    //But it gives output for n same as n+1 in fibonacci series
    public static void main(String[] args) {
        int n = 3;
        int prev2 = 1;   // here it is 1 because it has only one way if he is standing at the ground
        int prev1 = 1;   // here it is 1 because it has only one way if he is standing at 1st stair
        int curr = 0;
        for(int i = 2; i <= n; i++){
            curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
