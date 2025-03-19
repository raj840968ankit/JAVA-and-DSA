import java.util.*;
public class primeRange {
    static boolean checkPrime(int n)
    {
        boolean b=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                b=false;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt(); 
        for(int i=2;i<=n;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
