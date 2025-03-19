import java.util.*;
public class threePairSum {
        static int pairSum(int a[],int key)
        {
           int i,j,k,pair = 0;
           for(i=0;i<a.length-2;i++)
           {
              for(j=i+1;j<a.length-1;j++)
              {
                for(k=j+1;k<a.length;k++)
                {
                   if(a[i]+a[j]+a[k]==key)
                   {
                    pair++;
                   }
                }
              }
           }
           return pair;
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
        System.out.print("Enter key to find pair sum : ");
        int key =sc.nextInt();
        int z = pairSum(a,key);
        System.out.print("pairs : "+z);
        sc.close();
    }
}
