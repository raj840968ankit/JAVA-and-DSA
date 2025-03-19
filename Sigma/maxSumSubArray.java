import java.util.*;
public class maxSumSubArray {
    static int maxSum(int a [])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int currentSum=0;
                for(int k=i;k<=j;k++)
              {
                  currentSum=currentSum+a[k];
              }
              if(currentSum>largest)
              {
                largest=currentSum;
              } 
            } 
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(("Enter size of array: "));
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("largest sum of subArray is "+maxSum(a));
        sc.close();
    }
}
