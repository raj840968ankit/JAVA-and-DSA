import java.util.*;
public class binaryToDecimal {
    static int binToDec(int n)
    {
        int ld,c=0,bit=1;
        while(n!=0)
        {
          ld=n%10;
          c=c+(ld*bit);
          bit=bit*2;
          n=n/10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary Digits: ");
        int n=sc.nextInt();
        System.out.println("Corresponding decimal = "+binToDec(n));
        sc.close();
    }
}
