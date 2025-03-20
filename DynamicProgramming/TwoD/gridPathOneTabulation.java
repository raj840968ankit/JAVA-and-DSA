package DynamicProgramming.TwoD;


public class gridPathOneTabulation {
    public static void main(String[] args) {
        int m = 3, n = 2;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) continue;
                int up = 0;
                int left = 0;
                if(i - 1 >= 0){
                    up = dp[i - 1][j];
                }
                if(j - 1 >= 0){
                    left = dp[i][j - 1];
                }
                dp[i][j] = up + left;
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
