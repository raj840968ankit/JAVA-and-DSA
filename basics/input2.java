import java.util.Scanner;
public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("number is "+a);
        System.out.println("enter a string");
        String name = sc.next();                      // without spaces string
        System.out.println("name is "+name);
        sc.close();
    }
}
