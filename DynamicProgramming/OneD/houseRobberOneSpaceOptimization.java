

public class houseRobberOneSpaceOptimization {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};  //output = 4
        int n = nums.length;
        int prev = nums[0];
        int prev2 = nums[0];
        for(int i = 1; i < n; i++){
            int take = nums[i];
            if(i > 1){
                take = nums[i] + prev2;
            }
            int notTake = prev;
            int curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
    }
}
