import java.util.Scanner;
public class validTriangleSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides of triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b)
        {
            System.out.println("formation of triangle is possible");
        }
        else
        {
            System.out.println("formation of triangle is not possible");
        }
        sc.close();
    }
}
