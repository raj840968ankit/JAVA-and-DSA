import java.util.*;

public class cancelDuplicates {
    static int[] checkDuplicate(int a[])
    {
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        return a;
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
        System.out.print("non duplicate elements are : ");
        for(i=0;i<n;i++)
        {
            if(a[i]!=-1)
            {
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}
