import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number : ");
       int a = sc.nextInt();
       if(a<0)
       {
        a = a* (-1);
        System.out.println("the absolute value of the given number is "+a);
       } 
       else System.out.println("the absolute value of the given number is "+a);
        sc.close();
    }
}
