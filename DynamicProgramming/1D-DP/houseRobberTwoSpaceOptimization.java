package DynamicProgramming;

public class houseRobberTwoSpaceOptimization {
    //this question states that the house is circular manner means 0 and n-1 are neighbour/adjacent
    //so we can rob either (0 to n-2) or (1 to n-1) in non adjacent houses
    public static int houseRobber(int start, int n, int[] nums) {
        int prev2 = nums[start];
        int prev = nums[start];
        for(int i = start + 1; i <= n; i++){
            int take = nums[i];
            if(i > start + 1){
                take = nums[i] + prev2;
            }
            int notTake = prev;
            int curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,2}; //output3
        int n = nums.length;
        int start1 = 0, end1 = n-2;
        int start2 = 1, end2 = n-1;
        int res = houseRobber(start1, end1, nums);
        int res2 = houseRobber(start2, end2, nums);
        System.out.println(Math.max(res,res2));
    }
}
