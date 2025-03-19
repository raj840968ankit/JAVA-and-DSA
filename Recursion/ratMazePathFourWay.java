package Recursion;
import java.util.*;
public class ratMazePathFourWay { 
    // a rat is standing at (0,0) and destination is (n-1, n-1)
    //he can move in 4 direction D|L|R|U
    public static void move(int i, int j, int n, ArrayList<ArrayList<Integer>> mat, boolean[][] visited,  StringBuilder str, ArrayList<String>  ans){
        if(i == n - 1 && j == n - 1){
            ans.add(str.toString());
            return;
        }
        //here we will write (visited[i][j] = false)  inside if because :- 
        //     if it selects the wrong path it will be mark as visited and it will again mark as unvisited
        //     we are searching for all possible path (if confusion go on word search problem)

        //move in downward 
        if( i+1 < n && !visited[i+1][j] && mat.get(i+1).get(j) == 1){ // if this condition satisfies then mark [i][j] as visited and move downward
            visited[i][j] = true;
            str.append("D");
            move(i+1, j, n, mat, visited, str, ans);
            str.deleteCharAt(str.length() - 1);
            visited[i][j] = false;
        }
        
        //move in leftward
        if( j-1 >= 0 && !visited[i][j - 1] && mat.get(i).get(j - 1) == 1){ // if this condition satisfies then mark [i][j] as visited and move leftward
            visited[i][j] = true;
            str.append("L");
            move(i, j - 1, n, mat, visited, str, ans);
            str.deleteCharAt(str.length() - 1);
            visited[i][j] = false;
        }

        //move in rightward
        if( j+1 < n && !visited[i][j + 1] && mat.get(i).get(j + 1) == 1){ // if this condition satisfies then mark [i][j] as visited and move rightward
            visited[i][j] = true;
            str.append("R");
            move(i, j + 1, n, mat, visited, str, ans);
            str.deleteCharAt(str.length() - 1);
            visited[i][j] = false;
        }

        //move in upward
        if( i-1 >= 0 && !visited[i - 1 ][j] && mat.get(i - 1).get(j) == 1){ // if this condition satisfies then mark [i][j] as visited and move upward
            visited[i][j] = true;
            str.append("U");
            move(i - 1, j, n, mat, visited, str, ans);
            str.deleteCharAt(str.length() - 1);
            visited[i][j] = false;
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
        if(mat.get(0).get(0) == 1){
            move(0, 0, n, mat, visited, str, ans);
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
