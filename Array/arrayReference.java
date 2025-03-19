import java.util.*;
public class arrayReference {
    static void changeArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int i,n;
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements of array:");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        changeArray(a);
        System.out.print("Changed array is : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
 