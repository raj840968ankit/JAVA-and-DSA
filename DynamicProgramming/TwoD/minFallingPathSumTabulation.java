package DynamicProgramming.TwoD;

public class minFallingPathSumTabulation {
    /*Question states that falling path start from any element
      in first row and can move in lower, left-lower diagonal,
      right-lower-diagonal
     */
    public static void main(String[] args) {
        int[][] nums = {{2,1,3}, {6,5,4}, {7,8,9}};
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        //consider all the base cases
        for(int i = 0 ; i < n; i++){
            dp[0][i] = nums[0][i];
        }
        
        //since we have considered row 0 as base case, start form 1
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                //if there is out of boundary condition for direction movement set it to max value
                int upper = Integer.MAX_VALUE;
                int rightUpperDiagonal = Integer.MAX_VALUE;
                int leftUpperDiagonal = Integer.MAX_VALUE;
                if(i - 1 >= 0){
                    upper = dp[i-1][j];
                }
                if(i - 1 >= 0 && j - 1 >= 0){
                    leftUpperDiagonal = dp[i-1][j-1];
                }
                if(i - 1 >= 0 && j + 1 < n){
                    rightUpperDiagonal = dp[i-1][j+1];
                }
                dp[i][j] = nums[i][j] + Math.min(upper, Math.min(leftUpperDiagonal, rightUpperDiagonal));
            }
        }
        /*now the corresponding indexes in dp array contains minimum answer
         but we want only minimum of (minimum stored in the last row)
        */
        int minPath = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            minPath = Math.min(minPath, dp[n-1][i]);
        }
        System.out.println(minPath);
    }
}
