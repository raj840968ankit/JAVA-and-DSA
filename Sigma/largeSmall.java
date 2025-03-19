import java.util.*;
public class largeSmall{
    static void largestSmallest(int a[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
            if(a[i]<smallest)
            {
                smallest=a[i];
            }   
        }
        System.out.println("largest = "+largest);
        System.out.println("smallest = "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        largestSmallest(a);
        sc.close();
    }
}
