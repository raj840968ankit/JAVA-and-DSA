import java.util.*;

public class subArrays {
      static void subArray(int a[])
    {
        int subTotal=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                subTotal++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArrays = "+subTotal);
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
        subArray(a);
        sc.close();
    }
}
