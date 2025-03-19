package Recursion;

public class wordSearch {
    public static boolean traverseAndFind(int index, int i, int j, char[][] board, String word, boolean[][] visited, int row, int col){
        if(index == word.length()){
            return true;
        }
        boolean found = false;
        //here we will not write (visited[i][j] = false)  inside if because :- 
        //     if it selects the wrong path it will be mark as visited and it will won't go on that path again
        //     we are searching for one word only.(if confusion go on rat maze problem) 
        
        //move downward
        if(i+1 < row  && board[i+1][j] == word.charAt(index) && !visited[i+1][j]){
            visited[i][j] = true;
            if(traverseAndFind(index + 1, i+1, j, board, word, visited, row, col)) return true;
        }
        //move rightward
        if(j+1 < col  && board[i][j+1] == word.charAt(index) && !visited[i][j+1]){
            visited[i][j] = true;
            if(traverseAndFind(index + 1, i, j+1, board, word, visited, row, col)) return true;
        }
        //move upward
        if(i-1 >= 0  && board[i-1][j] == word.charAt(index) && !visited[i-1][j]){
            visited[i][j] = true;
            if(traverseAndFind(index + 1, i-1, j, board, word, visited, row, col)) return true;
        }
        //move leftward
        if(j-1 >= 0  && board[i][j-1] == word.charAt(index) && !visited[i][j-1]){
            visited[i][j] = true;
            if(traverseAndFind(index + 1, i, j-1, board, word, visited, row, col)) return true;;
        }
        visited[i][j] = false;
        return found;
    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[board.length][board[0].length];
        //since we have no criteria for moving (rat maze -> criteria based(1)) and word can be placed anywhere
        //that's why we are using loop for every cell
        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                if(board[i][j] == word.charAt(0)){
                    visited[i][j] = true;
                    if(traverseAndFind(1, i, j, board, word, visited, row, col)){
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        boolean ans = exist(board, word);
        System.out.println(ans);
    }
}
