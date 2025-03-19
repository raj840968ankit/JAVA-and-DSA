package DynamicProgramming; 
public class houseRobberOneRecursion {
    public static int houseRobber(int n, int[] nums) {
        if(n < 0) {
            return 0;
        }
        //take and call for non adjacent element which is (n-2)
        int take = nums[n] + houseRobber(n-2, nums);
        //not take and call for next element which is (n-1)
        int notTake = houseRobber(n-1, nums);
        return Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int n = nums.length;
        int res = houseRobber(n-1, nums);
        System.out.println(res);
    }
}
