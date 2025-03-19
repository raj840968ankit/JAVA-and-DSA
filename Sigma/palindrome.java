import java.util.*;
public class palindrome {
    static boolean checkPalindrome(int n)
    {
        int ld,num=0,orig=n;
        boolean flag=false;
        while(n!=0)
        {
            ld=n%10;
            num=num*10+ld;
            n=n/10;
        }
        if(num==orig)
        {
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number to check palindrome: ");
        int n= sc.nextInt();
        System.out.println("palindrome = "+checkPalindrome(n));
        sc.close();
    }
}
