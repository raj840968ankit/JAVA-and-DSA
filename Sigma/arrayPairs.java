import java.util.*;
public class arrayPairs{
    static void pairs(int a[])
    {
        int pairs=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("("+a[i]+","+a[j]+") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+pairs);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements of Array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        pairs(a);
        sc.close();
    }
}