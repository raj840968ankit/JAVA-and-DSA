import java.util.*;
public class copyArray {
    static void copied(int a2[])
    {
       for(int i=0;i<a2.length;i++)
       {
        System.out.print(a2[i]+" ");
       }
    }
    static void original(int a1[])
    {
       for(int i=0;i<a1.length;i++)
       {
        System.out.print(a1[i]+" ");
       }
       System.out.print("\n");
    }

    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of elements: ");
        n=sc.nextInt();
        int a1[] = new int[n];
        for(i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        int a2[]=a1;
        System.out.print("original array is : ");
        original(a1);
        System.out.print("copied array is : ");
        copied(a2);
        sc.close();
    }
}
