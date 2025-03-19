import java.util.Scanner;
public class maxSubArraySum {
    public void maximum(int[] a){
        int sum,largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                   sum+=a[k];
                }
                if(sum>largest){
                    largest=sum;
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter no of elements: ");
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        maxSubArraySum obj=new maxSubArraySum();
        obj.maximum(a);
    }
}
