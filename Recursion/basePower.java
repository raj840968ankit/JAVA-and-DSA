package Recursion;
import java.util.*;
public class basePower {
    public static double calculate(double base, long power){
        if(power == 0){
            return 1;
        }
        //even power - multiply base * b and power / 2
        if(power % 2 == 0){
            return calculate(base * base, power / 2);
        }
        //even power - multiply base * base^(power -1)
        return base * calculate(base, power - 1);
    }
    public static double myPow(double x, int n) {
        boolean positivePower = n >= 0;
        boolean negativePower = n < 0;
        boolean positiveBase = x >= 0;
        boolean negativeBase = x < 0;
        double base = x >= 0 ? (double)x : -(double)x;
        long power = n >= 0 ? (long)n : -(long)n;
        double ans = calculate(base, power);
        //handles for positive answers
        if(positiveBase && positivePower || negativeBase && positivePower && n % 2 == 0){
            return ans;
        }
        //handles for negative answers
        if(negativeBase && positivePower && n % 2 != 0){
            return -ans;
        }
        //handles for inverse and positive answers
        if(positiveBase && negativePower || negativeBase && negativePower && n % 2 == 0){
            return 1/ans;
        }
        //handles for inverse and negative answers
        if(negativeBase && negativePower && n % 2 != 0){
            return -1/ans;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x =  sc.nextDouble();
        int n = sc.nextInt();
        double baseRaisePow = myPow(x,n);
        System.out.println(baseRaisePow);
        sc.close();
    }
}
