package Recursion;
import java.util.*;
public class nQueenOptimal {
    
    public static void placeQueen(int col, char[][] board, List<List<String>> res, int n, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal){
        if(col == board.length){
            List<String> list = new ArrayList<>(); 
            //converting each row in board array to list of string
            for(char[] ch : board){
                list.add(new String(ch));
            }
            res.add(list);
            return;
        }
        //checking each row of specified column
        for(int row = 0; row < board.length; row++){
            //checking for lower diagonal of (row + col), left row of 'row' and upperDiagonal of (n-1) + (col - row) 
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;
                placeQueen(col + 1, board, res,  n, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(char[] ch : board){
            Arrays.fill(ch,'.');
        }
        List<List<String>> res = new ArrayList<>();
        int[] leftRow = new int[n];
        //creating hashArray of leftRow of n size and lowerDiagonal and upperDiagonal of (2 * n - 1) size because the value of index max goes upto max(row + col indexing)
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];
        placeQueen(0, board, res,  n, leftRow, lowerDiagonal, upperDiagonal);
        for(List<String> list : res){
            System.out.println(list);
        }
    }
}
