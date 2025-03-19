import java.util.*;
public class elementOccurrence {
    static void occurrence(int a[])
    {
        int i,j;
        for(i=0;i<a.length-1;i++)
        { 
            int count = 1;
            if(a[i]==-1)
            continue;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=-1;
                }
            }
               System.out.println(a[i]+" occurs "+count+" times");
            a[i]=-1;
        }
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
        occurrence(a);
        sc.close();
    }
}
