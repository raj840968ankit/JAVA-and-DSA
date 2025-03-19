import java.util.*;
public class prefixSubArrayLargestSum {
    static void prefixSum(int[] arr){
        int maximum=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<prefix.length;i++){
            int start=i;
            for(int j=i;j<prefix.length;j++){
                int end=j;
               int currentSum=0;
               currentSum= start == 0 ? prefix[end]: prefix[end]-prefix[start-1];
               if(currentSum>maximum){
                maximum=currentSum;
               }
            }
        }
        System.out.println("Largest sum of SubArray is: "+maximum);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum(arr);
    }
}
