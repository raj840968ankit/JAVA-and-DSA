import java.util.*;
public class subArray {
    public void subArr(int[] sub){
        for(int i=0;i<sub.length;i++){
            for(int j=i;j<sub.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(sub[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter no of elements: ");
        n=sc.nextInt();
        int[] sub= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<sub.length;i++){
            sub[i]=sc.nextInt();
        }
        subArray obj=new subArray();
        obj.subArr(sub);
        sc.close();
        
    }
}
