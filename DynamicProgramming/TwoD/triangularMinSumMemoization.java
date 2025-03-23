package DynamicProgramming.TwoD;

import java.util.*;

public class triangularMinSumMemoization {
    //Movement can be in lower direction or left lower diagonal direction
    public static int minSum(int i, int j, int m, int n, List<List<Integer>> list, int[][] dp){
        if(i == m-1){   //last row
            return list.get(m-1).get(j);
        }
        if(dp[i][j] != -1) return dp[i][j];
        int lower = list.get(i).get(j) + minSum(i+1, j, m, n, list, dp);
        int leftLowerDiagonal = list.get(i).get(j) + minSum(i+1, j+1, m, n, list, dp);
        return dp[i][j] = Math.min(lower, leftLowerDiagonal);
    }
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < 4 ; i++){
            triangle.add(new ArrayList<>());
        }
        triangle.get(0).add(2);
        triangle.get(1).add(3);
        triangle.get(1).add(4);
        triangle.get(2).add(6);
        triangle.get(2).add(5);
        triangle.get(2).add(7);
        triangle.get(3).add(4);
        triangle.get(3).add(1);
        triangle.get(3).add(8);
        triangle.get(3).add(3);
        int m = triangle.size(); // row numbers
        int n = m; //(row no = no.of col in a row)  0 based indexing 
        int[][] dp = new int[m][m];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        //here we consider i = 0 and j = 0 because from below we have to start from each element in last row
        int res = minSum(0, 0, m, n, triangle, dp);
        System.out.println(res);
    }
}
