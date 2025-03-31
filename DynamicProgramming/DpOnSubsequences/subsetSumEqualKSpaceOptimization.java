package DynamicProgramming.DpOnSubsequences;

public class subsetSumEqualKSpaceOptimization {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};
        int n = arr.length;
        int sum = 6;
        boolean[] prev = new boolean[sum + 1];
        
        //base case 1 :- for every index if target is 0 then it contain true value
        //for any array the target contains 0 will be true
        prev[0] = true;

        // Base Case 2: If first element is within sum range, mark it as true
        if (arr[0] <= sum) {
            prev[arr[0]] = true;
        }
        
        for(int i = 1; i < n; i++){
            boolean[] curr = new boolean[sum + 1];
            // Set base case for curr: a subset sum of 0 is always achievable.
            curr[0] = true;  //true because target 0 will always give true
            for(int target = 1 ; target < sum + 1; target++){
                boolean take = false;
                if(target >= arr[i]){
                    take = prev[target - arr[i]];
                }
                boolean notTake = prev[target];
                curr[target] = take || notTake;
            }
            prev = curr;
        }
        System.out.println(prev[sum]);
    }
}
