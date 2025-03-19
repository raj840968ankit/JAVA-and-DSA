import java.util.*;
public class evenWithoutOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        int a= n&1;
        if(a!=0)
        {
           System.out.println("odd");
        }
        else
        {
           System.out.println("even");
        }
        sc.close();
    }
}
