import java.util.Scanner;

public class decimalToBinary {
    static long decToBin(int n)
    {
        int rem,ten=1;
        long num=0;
        while(n!=0)
        {
            rem=n%2;
            num=num+rem*ten;
            ten=ten*10;
            n=n/2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal Digits: ");
        int n=sc.nextInt();
        System.out.println("Corresponding binary = "+decToBin(n));
        sc.close();
    }
}
