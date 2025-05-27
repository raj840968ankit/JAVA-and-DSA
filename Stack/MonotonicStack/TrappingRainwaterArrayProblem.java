package Stack.MonotonicStack;
//copy, not monotonic stack problem

public class TrappingRainwaterArrayProblem {
    public static int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;
        int left = 0, right = height.length - 1;

        //loop will always end at tallest building(largest element)
        while(left < right){
            //always traverse the smaller building first
            if(height[left] <= height[right]){
                //checking if leftMax is greater than arr[left]
                //if it is then there water must be stored
                if(leftMax > height[left]){
                    trappedWater += leftMax - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left = left + 1;
            }            
            else{
                if(rightMax > height[right]){
                    trappedWater += rightMax - height[right];
                }
                else{
                    rightMax = height[right];
                }
                right = right - 1;
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
