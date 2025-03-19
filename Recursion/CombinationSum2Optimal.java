package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2Optimal {
    public static void combinationSum(int i, int n, int target,int[] candidates, ArrayList<Integer> list,  List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j = i; j < n ; j++){
            if(j > i && candidates[j] == candidates[j - 1] ){
                continue;
            }
            if(target < candidates[j]){
                break;
            }
            //take and repeat the same
            list.add(candidates[j]);
            combinationSum(j+1, n, target - candidates[j], candidates, list, ans);
            //remove when return
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] candidates ={10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(0,candidates.length,target,candidates,new ArrayList<>(),ans);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
