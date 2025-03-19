import java.util.*;

public class smallestAndLargest {
    static int[] smallAndLarge(int a[])
    {
       Arrays.sort(a);
       int ans[]={a[0],a[a.length-1]};
       return ans;
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
        int ans[]=smallAndLarge(a1);
        System.out.println("smallest = "+ans[0]);
        System.out.println("smallest = "+ans[1]);
        sc.close();
    }
}
