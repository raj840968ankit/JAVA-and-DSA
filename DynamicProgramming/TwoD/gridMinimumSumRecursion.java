package DynamicProgramming.TwoD;

public class gridMinimumSumRecursion {
    public static int minSum(int m, int n, int[][] nums){
        if(m == 0 && n == 0){
            return nums[0][0];
        }
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        /*
          here we can't do like this because we are returning max value also so if we add
          any positive number just after returning that value will lead to positive value
           int up = nums[m][n] + minSum(m - 1, n, nums); 
           int left = nums[m][n] + minSum(m, n - 1, nums);
        */

        int up =  minSum(m - 1, n, nums);
        int left = minSum(m, n - 1, nums);
        return nums[m][n] + Math.min(up , left);
    }
    public static void main(String[] args) {
        int[][] nums = {{1,3,1}, {1,5,1}, {4,2,1}};
        int m = nums.length;
        int n = nums[0].length;
        int res = minSum(m - 1, n - 1, nums);
        System.out.println(res);
    }
}
