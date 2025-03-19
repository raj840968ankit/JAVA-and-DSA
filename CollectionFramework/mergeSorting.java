import java.util.*;
public class mergeSorting {
    public static void merge(int a[],int low,int mid,int high){
        int i = low;
        int j = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                list.add(a[i]);
                i++;
            }
            else{
                list.add(a[j]);
                j++;
            }
        }
        while(j<=high){
            list.add(a[j]);
            j++;
        }
        while(i<=mid){
            list.add(a[i]);
            i++;
        }
        for(int k=low;k<=high;k++){
            a[k]=list.get(k-low);
        }
    }

    public static void mergeSort(int[] a,int low,int high){
        if(low<high){
             int mid = ((low + high) / 2);
             mergeSort(a,low,mid);
             mergeSort(a,mid+1,high);
             merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergeSort(a,0,n-1);
        sc.close();
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
