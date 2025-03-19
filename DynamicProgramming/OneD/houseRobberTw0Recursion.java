

public class houseRobberTw0Recursion {
    //this question states that the house is circular manner means 0 and n-1 are neighbour/adjacent
    //so we can rob either (0 to n-2) or (1 to n-1) in non adjacent houses

    public static int houseRobber(int start, int n, int[] nums) {
        if(n < start) {
            return 0;
        }
        //take and call for non adjacent element which is (n-2)
        int take = nums[n] + houseRobber(start, n-2, nums);
        //not take and call for next element which is (n-1)
        int notTake = houseRobber(start, n-1, nums);
        return Math.max(take, notTake);
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
