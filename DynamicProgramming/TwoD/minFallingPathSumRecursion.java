package DynamicProgramming.TwoD;

public class minFallingPathSumRecursion {
    /*Question states that falling path start from any element
      in first row and can move in lower, left-lower diagonal,
      right-lower-diagonal
     */
    public static int minSum(int i, int j, int boundary, int[][] nums){
        //whenever i reaches first row and j is in boundary then returning nums[0][j]
        if(i == 0 && j >= 0 && j < boundary){
            return nums[0][j];
        }

        //whenever i or j crosses boundary then returning max value
        if(i < 0 || j < 0 || j >= boundary){
            return Integer.MAX_VALUE;
        }
        int upper = minSum(i - 1, j, boundary, nums);
        int leftUpperDiagonal = minSum(i - 1, j - 1, boundary, nums);
        int rightUpperDiagonal = minSum(i - 1, j + 1, boundary, nums);
        return nums[i][j] + Math.min(upper, Math.min(leftUpperDiagonal, rightUpperDiagonal));
    }
    public static void main(String[] args) {
        int[][] nums = {{2,1,3}, {6,5,4}, {7,8,9}};
        int n = nums.length;
        //starting from last row for every possible element and storing min value
        int minPath = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int res = minSum(n-1, i, n, nums);
            minPath = Math.min(res, minPath);
        }
        System.out.println(minPath);
    }
}
