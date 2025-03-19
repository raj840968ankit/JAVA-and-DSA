package Recursion;
import java.util.*;
public class ratMazePathOptimal {
    // a rat is standing at (0,0) and destination is (n-1, n-1)
    //he can move in 4 direction D|L|R|U
    public static void move(int i, int j, int n, int di[], int dj[], ArrayList<ArrayList<Integer>> mat, boolean[][] visited,  StringBuilder str, ArrayList<String>  ans){
        if(i == n -1 && j == n-1){
            ans.add(str.toString());
            return;
        }
        String dir = new String("DLRU");
        //here ind variable is representing direction down, left, right, up in di[] and dj[] 
        for(int ind = 0; ind < 4; ind++){
            int nextI = i + di[ind];
            int nextJ = j + dj[ind];
            if( nextI >= 0 && nextJ >= 0 && nextI < n && nextJ < n && !visited[nextI][nextJ] && mat.get(nextI).get(nextJ) == 1){
                visited[i][j] = true;
                str.append(dir.charAt(ind));
                move(nextI, nextJ, n, di, dj, mat, visited, str, ans);
                str.deleteCharAt(str.length() - 1);
                visited[i][j] = false;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        //values in a maze matrix
        for(int i = 0; i < 4 ; i++){
            mat.add(new ArrayList<>());
        }
        int n = mat.size();
        mat.get(0).add(1);
        mat.get(0).add(0);
        mat.get(0).add(0);
        mat.get(0).add(0);
        mat.get(1).add(1);
        mat.get(1).add(1);
        mat.get(1).add(0);
        mat.get(1).add(1);
        mat.get(2).add(1);
        mat.get(2).add(1);
        mat.get(2).add(0);
        mat.get(2).add(0);
        mat.get(3).add(0);
        mat.get(3).add(1);
        mat.get(3).add(1);
        mat.get(3).add(1);
        boolean[][] visited = new boolean[4][4];
        StringBuilder str = new StringBuilder("");
        ArrayList<String>  ans = new ArrayList<>();
        int di[] = {1, 0, 0, -1}; // since we are considering direction as DLRU so we put corresponding values in the array(DLRU pattern)
        int dj[] = {0, -1, 1, 0};
        if(mat.get(0).get(0) == 1){
            move(0, 0, n, di, dj, mat, visited, str, ans);
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
