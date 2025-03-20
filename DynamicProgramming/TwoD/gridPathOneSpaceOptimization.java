package DynamicProgramming.TwoD;

public class gridPathOneSpaceOptimization {
    public static void main(String[] args) {
        int m = 3, n = 2;
        int[] prev = new int[n];
        
        for(int i = 0; i < m; i++){
            int[] curr = new int[n];
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    curr[j] = 1;
                    continue;
                } 
                int up = 0;
                int left = 0;
                if(i - 1 >= 0){
                    up = prev[j];
                }
                if(j - 1 >= 0){
                    left = curr[j - 1];
                }
                curr[j] = up + left;
            }
            prev = curr;
        }
        System.out.println(prev[n-1]);
    }
}
