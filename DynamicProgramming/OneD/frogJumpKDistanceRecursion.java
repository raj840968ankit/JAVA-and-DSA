
public class frogJumpKDistanceRecursion {
    public static int jumpKDistance(int n, int k, int[] nums){
        if(n == 0) return 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            if(i <= n){
                int jumpValue = jumpKDistance(n-i, k, nums) + Math.abs(nums[n] - nums[n-i]);
                minValue = Math.min(minValue,jumpValue);
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int k = 3, nums[]= {10, 30, 40, 50, 20};
        int n = nums.length;
        int res = jumpKDistance(n-1,k, nums);
        System.out.println(res);
    }
}
