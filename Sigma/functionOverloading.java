import java.util.*;
public class functionOverloading{
    static int sum(int a,int b, int c){
        return a+b+c;
    }
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("sum = "+sum(a,b));
        System.out.println("sum = "+sum(a,b,c));
        sc.close();
    }
}