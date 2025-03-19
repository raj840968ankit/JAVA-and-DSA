import java.util.Scanner;
public class leapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year to check leap year : ");
        int a = sc.nextInt();
        if(a%100==0)
        {
            if(a%400==0)
            {
                System.out.println(a+" is a leap year");
            }
            else{
                System.out.println(a+" is not a leap year");
            }
        }
        else
        {
            if(a%4==0)
            {
                System.out.println(a+" is a leap year");
            }
            else{
                System.out.println(a+" is not a leap year");
            }
        }
        sc.close();
    }
}