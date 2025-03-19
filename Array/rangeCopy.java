import java.util.*;

public class rangeCopy {
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
        int a2[]=Arrays.copyOfRange(a1,1,4);         //here from 1 is inclusive but to 3 in exclusive(means up to 2)                    
        System.out.print("original array is : ");
        original(a1);
        System.out.print("changed array is : ");
        for(i=0;i<a2.length;i++)
       {
        System.out.print(a2[i]+" ");
       }
        sc.close();
    }
}
