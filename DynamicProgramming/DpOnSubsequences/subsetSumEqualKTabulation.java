package DynamicProgramming.DpOnSubsequences;

public class subsetSumEqualKTabulation {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};
        int n = arr.length;
        int sum = 6;
        boolean[][] dp = new boolean[n][sum + 1];

        //base case 1 :- for every index if target is 0 then it contain true value
        for(int i = 0; i < n; i++){
            dp[i][0] = true;
        }

        // Base Case 2: If first element is within sum range, mark it as true
        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }
        
        for(int i = 1; i < n; i++){
            for(int target = 1 ; target < sum + 1; target++){
                boolean take = false;
                if(target >= arr[i]){
                    take = dp[i - 1][target - arr[i]];
                }
                boolean notTake = dp[i - 1][target];
                dp[i][target] = take || notTake;
            }
        }
        System.out.println(dp[n-1][sum]);
    }
}
