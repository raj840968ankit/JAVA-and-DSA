import java.util.Scanner;

public class evenOddWithoutIfElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        boolean even = true;
        for(int i=1;i<=n;i++)
        {
            even=!even;
        }
        System.out.println("even = "+even);
        sc.close();
    }
}
