import java.util.*;
class rotateArray{
    static int[] rotateRightToLeft(int a[],int k)
    {
        int n=a.length;
        k= k%n;
        int ans[]= new int[n];
        int i,j=0;
        for(i=n-k;i<n;i++)
        {
            ans[j++]=a[i];
        }
        for(i=0;i<n-k;i++)
        {
            ans[j++]=a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("enter no of elements: ");
            int n= sc.nextInt();
            int a[]=new int[n];
            System.out.println("enter elements of Array:");
            int i,key;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("enter no of rotation : ");
            key=sc.nextInt();
            int ans[]=rotateRightToLeft(a,key);
            System.out.print("Rotated Array : ");
            for(i=0;i<ans.length;i++)
            {
                System.out.print(ans[i]+" ");
            }
            sc.close();
    }
}