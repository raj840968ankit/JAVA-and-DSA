package Recursion;

import java.util.ArrayList;

public class arraySubsequences {
    public static void subSequences(int i, int n, ArrayList<Integer> ans, int[] arr){
        if(i >= n){
            System.out.println(ans);
            return;
        }
        //pick
        ans.add(arr[i]);
        subSequences(i+1,arr.length,ans,arr);
        //don't pick
        ans.remove(ans.size() - 1);
        subSequences(i+1,arr.length,ans,arr);
    }
    public static void main(String args[]){
        int[] arr = {3, 1, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        subSequences(0,arr.length,ans,arr);
    }
}
