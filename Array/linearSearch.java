import java.util.*;
class search{
    int linearSear(int a[],int key,int n, int j)
    {  int i;
        int ans=-1;
       for(i=0;i<n;i++)
       {
        if(a[i]==key) {
        ans = i;
        break;
        }
       }
    return ans;
    }
}
public class linearSearch {
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
        System.out.println("enter key to search: ");
        key=sc.nextInt();
        search obj = new search();
        int ans=obj.linearSear(a,key,n, i++);
        System.out.println(ans);
        sc.close();
    }
}
