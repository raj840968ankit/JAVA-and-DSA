package DynamicProgramming;

public class climbStairRecursion {
    // climbing stairs gives output same as fibonacci series 1 1 2 3 5 8....and so on
    //But it gives output for n same as n+1 in fibonacci series
    public static int climb(int n){
        if(n == 1) return 1;    /*if there is 1 stair then only one way can be made that is 1*/
        if(n == 2) return 2;    /*if there are 2 stairs then two way can be made that is 1,1 and 2*/
        return climb(n-1) + climb(n-2);
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climb(n));
    }
}
