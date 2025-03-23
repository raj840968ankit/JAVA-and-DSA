package DynamicProgramming.TwoD;

public class minFallingPathSumSpaceOptimization {
    /*Question states that falling path start from any element
      in first row and can move in lower, left-lower diagonal,
      right-lower-diagonal
     */
    public static void main(String[] args) {
        int[][] nums = {{2,1,3}, {6,5,4}, {7,8,9}};
        int n = nums.length;
        int[] prev = new int[n];
        
        //consider all the base cases
        for(int i = 0 ; i < n; i++){
            prev[i] = nums[0][i];
        }
        
        //since we have considered row 0 as base case, start form 1
        for(int i = 1; i < n; i++){
            int[] curr = new int[n];
            for(int j = 0; j < n; j++){
                //if there is out of boundary condition for direction movement set it to max value
                int upper = Integer.MAX_VALUE;
                int rightUpperDiagonal = Integer.MAX_VALUE;
                int leftUpperDiagonal = Integer.MAX_VALUE;
                if(i - 1 >= 0){
                    upper = prev[j];
                }
                if(i - 1 >= 0 && j - 1 >= 0){
                    leftUpperDiagonal = prev[j-1];
                }
                if(i - 1 >= 0 && j + 1 < n){
                    rightUpperDiagonal = prev[j+1];
                }
                curr[j] = nums[i][j] + Math.min(upper, Math.min(leftUpperDiagonal, rightUpperDiagonal));
            }
            prev = curr;
        }
        /*now the corresponding indexes in dp array contains minimum answer
         but we want only minimum of (minimum stored in the last row)
        */
        int minPath = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            minPath = Math.min(minPath, prev[i]);
        }
        System.out.println(minPath);
    }
}
