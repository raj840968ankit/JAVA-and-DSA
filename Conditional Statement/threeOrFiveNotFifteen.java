import java.util.Scanner;
public class threeOrFiveNotFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();
        if(a%3==0 || a%5==0)
        {
            if(a%15!=0)
            {
                System.out.println(a+" is divisible by either 3 or 5 but not by 15");
            }
        }
        else{
            System.out.println(a+" is divisible by neither 3 nor 5");
        }
        sc.close();
    }
}
