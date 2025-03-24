package DynamicProgramming.threeD;

public class NinjaAndFriendsRecursion {
    //Notes in copy
    public static int maxPick(int i, int j1, int j2, int m, int n, int[][] grid){
        //out of bound base case must be written first
        if(j1 < 0 || j1 >= n || j2 < 0 || j2 >= n){
            return Integer.MIN_VALUE;
        }
        //base case when it reaches last row
        if(i == m - 1){
            if(j1 == j2) return grid[m-1][j1];  // when both robot is at same cell then only one can pick chocolates
            if(j1 != j2) return grid[m-1][j1] + grid[m-1][j2]; //otherwise both cell chocolates will considered
        }

        int max = 0;
        /*for each movement of robot1, robot2 can make three movement.
          direction of robot in next row (i+1) is in (-1, 0, 1) columns
        */
        for(int d1 = -1; d1 <= 1; d1++){
            for(int d2 = -1; d2 <= 1; d2++){  /* at every iteration it is considering max(sum of two cells) (i+1, j1) and (i+1, j2)*/  
                int value = 0;                
                if(j1 == j2) value = grid[i][j1]; //when robots are standing at same cell
                else value = grid[i][j1] + grid[i][j2]; // when robots are standing at different cell
                value = value + maxPick(i+1, j1+ d1, j2+ d2, m, n, grid);
                max = Math.max(max, value);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,1}, {2,5,1}, {1,5,5}, {2,1,1}};
        int m = grid.length;
        int n = grid[0].length;
        int res = maxPick(0, 0, n-1, m, n, grid);
        System.out.println(res);
    }
}
