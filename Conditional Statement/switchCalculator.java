import java.util.Scanner;
public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation : + , _ , * , / , % .........");
        char ch = sc.next().charAt(0);
        System.out.println("Enter two Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        switch(ch)
        {
            case '+':
            System.out.println("sum = "+(a+b));
            break;
            case '-':
            System.out.println("difference = "+(a-b));
            break;
            case '*':
            System.out.println("product = "+(a*b));
            break;
            case '/':
            System.out.println("division = "+((float)a/b));
            break;
            case '%':
            System.out.println("modulus = "+(a%b));
            break;
            default:
            System.out.println("invalid operation");
        }
        sc.close();
    }
}
