package Recursion;
import java.util.*;
public class CombinationSum3 {
    public static void combinationSum(int index, int target, int sum, int size, List<Integer> list, List<List<Integer>> ans){
        if(sum == target && list.size() == size){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i <= 9; i++){
            if(sum > target) break;
            list.add(i);
            combinationSum(i+1, target, sum + i, size, list, ans);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int k = 3, n = 7;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinationSum(1, n, 0, k, list, ans);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
