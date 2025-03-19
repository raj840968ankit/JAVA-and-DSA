package DynamicProgramming.TwoD;
import java.util.*;
public class ninjaTrainingaMemoization {
    public static int maxMerit(int day, int lastTask, int[][] arr, int[][] dp){
        //base case at day = 0
        if(day == 0){
            int maxi = 0;
            for(int i = 0; i < 3 ; i++){
                if(i != lastTask){
                    maxi = Math.max(maxi, arr[0][i]);
                }
            }
            return maxi;
        }
        if(dp[day][lastTask] != -1) return dp[day][lastTask];
        int maxi = 0;
        for(int i = 0; i < 3 ; i++){
            if(i != lastTask){
                int maxMerit = arr[day][i] + maxMerit(day - 1, i, arr, dp);
                maxi = Math.max(maxi, maxMerit);
            }
        }
        return dp[day][lastTask] = maxi;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int day = arr.length;   //days can vary
        int lastTask = arr[0].length; /*last task number will always be 3 because:- 
        according to 0 based indexing it shows that none of the task is completed*/
        int[][] dp = new int[day][lastTask + 1];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        int res = maxMerit(day - 1, lastTask, arr, dp); 
        System.out.println(res);
    }
}
