package DynamicProgramming;

/*.....................Tabulation to Space Optimization.................................
  1) if there is such type of pattern having [i-1] and [1-2] then we can definitely optimize the space
  2) Replace (i, i-1, and i-2) with (curr, prev1, prev2) respectively.
  3) Store the value of (prev2 <- prev1), (prev1 <- curr)
*/

public class frogJumpSpaceOptimization {
    public static void main(String[] args) {
        int[] nums = {20,30,40,20};
        int n = nums.length;
        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1; i < n; i++){
            int oneStep = prev1 + Math.abs(nums[i] - nums[i-1]);
            int twoStep = Integer.MAX_VALUE;
            if(i >= 2){
                twoStep = prev2 + Math.abs(nums[i] - nums[i-2]);
            }
            int curr = Math.min(oneStep, twoStep);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
