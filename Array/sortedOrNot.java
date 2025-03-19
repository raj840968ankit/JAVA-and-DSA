import java.util.*;
public class sortedOrNot {
    static boolean sortCheck(int a[])
    {
        boolean check = true;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter elements of array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("sorted : "+sortCheck(a));
        sc.close();
    }
}
