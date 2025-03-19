import java.util.*;

public class secondMax {
    static int maximum(int a[])
    {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int secMax(int a[])
    {
        int max=maximum(a);
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>secmax && a[i]!=max)
            {
                secmax=a[i];
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int i,n;
        System.out.print("enter no of elements : ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter elements of array:");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("second largest : "+secMax(a));
        sc.close();
    }
}
