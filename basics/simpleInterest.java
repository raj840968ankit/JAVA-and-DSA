import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principle : ");
        float p = sc.nextFloat();
        System.out.print("enter rate : ");
        float r = sc.nextFloat();
        System.out.print("enter time : ");
        float t = sc.nextFloat();
        System.out.println("Simple interest = "+((p*r*t)/100));
        sc.close();
    }
}
