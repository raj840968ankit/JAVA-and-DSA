package DynamicProgramming.TwoD;

public class ninjaTrainingSpaceOptimization {
    /*...............Rules for 2D Tabulation to 2D Space optimization................
        1) it is possible to optimize space when (i-1) row has been there in recursive call and dp array
        2) Declare a prev arr of a col size same as DP col size which store the value of base case
        3) Declare a current array every time in the loop whenever a dp row operation starts
        4) replace dp[i][j] with curr[i] and dp[i-1][j] with prev[i]
        5) once 1 row operation is finished then store the value of curr array into prev array
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int day = arr.length;   //days can vary
        int lastTask = arr[0].length; /*last task number will always be 3 because:- 
        according to 0 based indexing it shows that none of the task is completed*/
        int[] prev = new int[lastTask + 1];   //this is for prev row calculation that will help for next row calculation

        //considering all the base cases from memoization
        prev[0] = Math.max(arr[0][1], arr[0][2]);//if day is O and last Task is 0 performed then we will take max of 2 other task 
        prev[1] = Math.max(arr[0][0], arr[0][2]);
        prev[2] = Math.max(arr[0][0], arr[0][1]);
        prev[3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2])); //if day = 1 is given in question then consider all three
        for(int Day = 1; Day < day; Day++){
            int[] curr = new int[lastTask + 1];  //this is to hold current row calculation value
            for(int last = 0; last < lastTask + 1; last++){
                int maxi = 0;
                for(int i = 0; i < 3 ; i++){
                  if(i != last){
                      int maxMerit = arr[Day][i] + prev[i];
                      maxi = Math.max(maxi, maxMerit);
                  }
                }
                curr[last] = maxi; // Store max value for current day and last task
            }
            //make current row as prev row
            prev = curr;
        }
        System.out.println(prev[lastTask]);
    }
}
