package Recursion;

public class BruteSubsetSumEqualsKLeetcode {
    public static int noOfSubSetsEqualsK(int index, int target, int[] nums){
        int count = 0;
        if(target == 0) return 1;
        if(index == 0) return (nums[0] == target) ? 1 : 0;
        //not take  and don't subtract from target
        count += noOfSubSetsEqualsK(index - 1, target, nums);
        // take and subtract from target
        if(target >= nums[index]){
            count += noOfSubSetsEqualsK(index - 1, target - nums[index], nums);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {5,7,8};
        int target = 3;
        int result = noOfSubSetsEqualsK(nums.length - 1, target, nums); 
        System.out.println(result);
    }
}
