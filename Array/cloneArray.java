import java.util.*;

public class cloneArray {
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
        int a2[]=a1.clone();                             //same work done by : int a2[]= Arrays.copyOf(a,a.length)
        System.out.print("original array is : ");
        original(a1);
        a2[0]=0;
        a2[1]=0;
        System.out.print("changed array is : ");
        for(i=0;i<a2.length;i++)
       {
        System.out.print(a2[i]+" ");
       }
        sc.close();
    }
}
