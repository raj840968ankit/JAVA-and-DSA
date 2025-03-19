import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number : ");
       int a = sc.nextInt();
       String ans= (a%2==0) ? "even" :"odd" ;
       System.out.println(ans);
       sc.close();
    }
}
