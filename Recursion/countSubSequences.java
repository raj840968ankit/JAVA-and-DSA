package Recursion;

import java.util.ArrayList;

public class countSubSequences {
    public static int subSequencesWithSumK(int i, int n, int sum, int target, ArrayList<Integer> ans, int[] arr){
        int cnt = 0;
        if(i >= n){
            if(sum == target){
                System.out.println(ans);
                return 1;
            }
            return 0;
        }
        //pick and add
        ans.add(arr[i]);
        sum += ans.get(ans.size() - 1);
        cnt += subSequencesWithSumK(i+1, arr.length, sum, target, ans, arr);
        //don't pick and subtract
        sum -= ans.get(ans.size() - 1);
        ans.remove(ans.size() - 1);
        cnt += subSequencesWithSumK(i+1, arr.length, sum, target, ans, arr);
        return cnt;
    }
    public static void main(String args[]){
        int[] arr = {3, 1, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        int target = 3;
        System.out.println(subSequencesWithSumK(0, arr.length, 0, target, ans, arr));
    }
}
