package DynamicProgramming.TwoD;

import java.util.*;

public class triangularMinSumRecursion {
    //Movement can be in lower direction or left lower diagonal direction
    public static int minSum(int i, int j, int m, int n, List<List<Integer>> list){
        if(i == m-1){   //last row
            return list.get(m-1).get(j);
        }
        int lower = list.get(i).get(j) + minSum(i+1, j, m, n, list);
        int leftLowerDiagonal = list.get(i).get(j) + minSum(i+1, j+1, m, n, list);
        return Math.min(lower, leftLowerDiagonal);
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 4 ; i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(6);
        list.get(2).add(5);
        list.get(2).add(7);
        list.get(3).add(4);
        list.get(3).add(1);
        list.get(3).add(8);
        list.get(3).add(3);
        int m = list.size(); // row numbers
        int n = m; //(row no = no.of col in a row)  0 based indexing 
        //here we consider i = 0 and j = 0 because from below we have to start from each element in last row
        int res = minSum(0, 0, m, n, list);
        System.out.println(res);
    }
}
