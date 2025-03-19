import java.util.*;
public class quickSorting {
    public static int partition(int a[],int low,int high){
        int x = a[high];
        int j=low-1;
        for(int i=low;i<high;i++){
            if(a[i]<=x){
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[j+1];
        a[j+1] = a[high];
        a[high] = temp;
        return j+1;
    }
    public static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivot = partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n-1);
        sc.close();
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
