import java.util.Scanner;
public class threeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        if(a>99 && a<1000)
        {
            System.out.println(a+" is a 3 digit number");
        }
        else {
            System.out.println(a+ " is not a 3 digit number");
        }
        sc.close();
    }
}
