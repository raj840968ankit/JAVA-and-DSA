package DynamicProgramming.DpOnSubsequences;

public class subsetSumEqualKMemoization {
    public static boolean existSum(int i, int sum, int[] arr, Boolean[][] dp){
        if(sum == 0) return true;
        if(i < 0) return false;
        if(dp[i][sum] != null) return dp[i][sum];
        if(sum >= arr[i]){
            if(existSum(i - 1, sum - arr[i], arr, dp)){
                return dp[i][sum] = true;
            }
        }
        if(existSum(i - 1, sum, arr, dp)){
            return dp[i][sum] = true;
        }
        return dp[i][sum] = false;
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};
        int n = arr.length;
        int sum = 6;
        Boolean[][] dp = new Boolean[n][sum + 1]; //using boolean value to check for null values;
        boolean res = existSum(n - 1, sum, arr, dp);
        System.out.println(res);
    }
}
