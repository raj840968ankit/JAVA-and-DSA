package DynamicProgramming.TwoD;

public class gridPathOneRecursion {
    public static int possiblePath(int m, int n){
        if(m == 0 && n == 0){
            return 1;
        }
        int up = 0;
        int left = 0;
        if(m - 1 >= 0){
            up = possiblePath(m - 1, n);
        }
        if(n - 1 >= 0){
            left = possiblePath(m, n - 1);
        }
        return up + left;
    }
    public static void main(String[] args) {
        int m = 3, n = 2;
        int res = possiblePath(m - 1, n - 1);
        System.out.println(res);
    }
}
