package DynamicProgramming.TwoD;

public class ninjaTrainingRecursion {
    public static int maxMerit(int day, int lastTask, int[][] arr){
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
        int maxi = 0;
        for(int i = 0; i < 3 ; i++){
            if(i != lastTask){
                int maxMerit = arr[day][i] + maxMerit(day - 1, i, arr);
                maxi = Math.max(maxi, maxMerit);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int day = arr.length;   //days can vary
        int lastTask = arr[0].length; /*last task number will always be 3 because:- 
        according to 0 based indexing it shows that none of the task is completed*/
        int res = maxMerit(day - 1, lastTask, arr); 
        System.out.println(res);
    }
}
