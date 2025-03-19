package Recursion;
import java.util.*;
public class nQueenBrute {
    public static boolean isSafe(int row, int col, char[][] board){
        int dupRow = row;
        int dupCol = col;
        //checking upper diagonal
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
            row--;
        }
        //checking for left row and updating the row and col with actual function parameter
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }
        //checking for lower diagonal
        row = dupRow;
        col = dupCol;
        while(row < board.length && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
    public static void placeQueen(int col, char[][] board, List<List<String>> res){
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
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                placeQueen(col+ 1, board, res);
                board[row][col] = '.';
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
        placeQueen(0, board, res);
        for(List<String> list : res){
            System.out.println(list);
        }
    }
}
