package DynamicProgramming.TwoD;

public class ninjaTrainingTabulation {
    /*...........Rules for 2D Memoization to 2D DP Tabulation.............
      1) if there is one base case in recursion for particular index (i) then consider for all possible 
        base cases of (i, j) -> (check memoization)
      2) it is obvious that 2D DP has 2 parameter changing in recursion then always follow:-
          2.1) there will be 2 loop for dp array only for corresponding changing parameter.
              2.1.1) 1st loop will run for 1st dimension. (i.e. baseCase <= i < m) where m is dp array 1st dimension's size.
                2.1.1.1) 2nd loop will run for 2nd dimension. (i.e. 0 <= j < n) where n is dp array 2nd dimension's size.
                     2.1.1.1.1) rest of the things will be copied same as recursion function as we were doing in 1D DP
                     2.1.1.1.2)2.1.2) Replace recursion calls with DP array and leave everything same
    */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int day = arr.length;   //days can vary
        int lastTask = arr[0].length; /*last task number will always be 3 because:- 
        according to 0 based indexing it shows that none of the task is completed*/
        int[][] dp = new int[day][lastTask + 1];

        //considering all the base cases from memoization
        dp[0][0] = Math.max(arr[0][1], arr[0][2]);//if day is O and last Task is 0 performed then we will take max of 2 other task 
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][0], arr[0][1]);
        dp[0][3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2])); //if day = 1 is given in question then consider all three
        for(int Day = 1; Day < day; Day++){
            for(int task = 0; task < lastTask + 1; task++){
                int maxi = 0;
                for(int i = 0; i < 3 ; i++){
                  if(i != task){
                      int maxMerit = arr[Day][i] + dp[Day - 1][i];
                      maxi = Math.max(maxi, maxMerit);
                  }
                }
                dp[Day][task] = maxi;
            }
        }
        System.out.println(dp[day - 1][lastTask]);
    }
}
