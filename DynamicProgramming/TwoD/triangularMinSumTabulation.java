package DynamicProgramming.TwoD;

import java.util.*;

public class triangularMinSumTabulation {
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
        //int n = m; //(row no = no.of col in a row)  0 based indexing 
        int[][] dp = new int[m][m];
        //consider all the base cases
        for(int j = 0; j < m; j++){
            dp[m-1][j] = triangle.get(m-1).get(j);
        }

        //now we can considered last row as base case so we will start from second last row
        for(int i = m - 2; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                int lower = triangle.get(i).get(j) + dp[i+1][j];
                int leftLowerDiagonal = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j] = Math.min(lower, leftLowerDiagonal);
            }
        }
        System.out.println(dp[0][0]);
    }
}
