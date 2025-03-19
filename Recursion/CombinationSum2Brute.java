package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2Brute {
    public static void combinationSum(int i, int n, int target,int[] candidates, ArrayList<Integer> list,  List<List<Integer>> ans){
        if(i >= n) {
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(target >= candidates[i]){
            //take and repeat the same
            list.add(candidates[i]);
            combinationSum(i+1, n, target - candidates[i], candidates, list, ans);
            //remove when return
            list.remove(list.size() - 1);
        }
        //not take
        combinationSum(i+1, n, target, candidates, list, ans);
    }
    public static void main(String[] args) {
        int[] candidates ={10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0,candidates.length,target,candidates,new ArrayList<>(),ans);
        HashSet<List<Integer>> ans2 = new HashSet<>();
        for(List<Integer> i : ans){
            Collections.sort(i);
            ans2.add(i);
        }
        for(List<Integer> i : ans2){
            System.out.println(i);
        }
    }
}
