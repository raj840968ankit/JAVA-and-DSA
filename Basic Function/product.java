import java.util.*;

public class product {
    public static int product2 (int a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product : "+product2(a,b));
        sc.close();
    }
}
