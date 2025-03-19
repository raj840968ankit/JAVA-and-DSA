import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]= new int[5][5];
        int i,j,n;
        System.out.print("enter rows or columns : ");
        n= sc.nextInt();
        System.out.println("enter elements os array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of array are:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
