package DynamicProgramming;

public class frogJumpRecursion {
    //frog can take either 1 jump or 2 jump 
    //calculate the min cost to reach the end
    public static int jump(int n, int[] nums ){
        if( n == 0) return 0;
        int oneStep = jump(n-1, nums) + Math.abs(nums[n] - nums[n-1]);
        int twoStep = Integer.MAX_VALUE;
        if(n >= 2){
            twoStep = jump(n-2, nums) + Math.abs(nums[n] - nums[n-2]);;
        }
        return Math.min(oneStep,twoStep);
    }
    public static void main(String[] args) {
        int[] nums = {20,30,40,20};
        int res = jump(nums.length - 1, nums);
        System.out.println(res);
    }
}

