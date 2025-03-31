package DynamicProgramming.DpOnSubsequences;

public class subsetSumEqualKRecursion {
    public static boolean existSum(int i, int sum, int[] arr){
        if(sum == 0) return true;
        if(i < 0) return false;
        if(sum >= arr[i]){
            if(existSum(i - 1, sum - arr[i], arr)){
                return true;
            }
        }
        if(existSum(i - 1, sum, arr)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};
        int sum = 6;
        boolean res = existSum(arr.length - 1, sum, arr);
        System.out.println(res);
    }
}
