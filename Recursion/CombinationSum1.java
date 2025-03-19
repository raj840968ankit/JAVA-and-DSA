package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void combinationSum1(int i, int n, int target,int[] candidates, ArrayList<Integer> list,  List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i >= n) return;
        if(target >= candidates[i]){
            //take and repeat the same
            list.add(candidates[i]);
            combinationSum1(i, n, target - candidates[i], candidates, list, ans);
            //remove when return
            list.remove(list.size() - 1);
        }
        //not take
        combinationSum1(i+1, n, target, candidates, list, ans);
    }
    public static void main(String[] args) {
        int[] candidates ={2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum1(0,candidates.length,target,candidates,new ArrayList<>(),ans);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
