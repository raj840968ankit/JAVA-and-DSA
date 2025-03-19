package Recursion;

import java.util.ArrayList;

public class arraySubsequencesWithSumK {
    public static void subSequencesWithSumK(int i, int n, int sum, int target, ArrayList<Integer> ans, int[] arr){
        if(i >= n){
            if(sum == target){
                System.out.println(ans);
            }
            return;
        }
        //pick and add
        ans.add(arr[i]);
        subSequencesWithSumK(i+1, arr.length, sum + arr[i], target, ans, arr);
        //don't pick and subtract
        ans.remove(ans.size() - 1);
        subSequencesWithSumK(i+1, arr.length, sum, target, ans, arr);
    }
    public static void main(String args[]){
        int[] arr = {3, 1, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        int target = 6;
        subSequencesWithSumK(0, arr.length, 0, target, ans, arr);
    }
}
