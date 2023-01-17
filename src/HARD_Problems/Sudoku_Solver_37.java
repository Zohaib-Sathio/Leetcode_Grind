package HARD_Problems;

public class Sudoku_Solver_37 {
    /*
    Runtime
19 ms
Beats
42.48%
Memory
39.7 MB
Beats
83.67%
     */
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private static boolean solve(char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board.length; col++){
                if(board[row][col] == '.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(isValid(row, col, board, c)){
                            board[row][col] = c;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[row][col] = '.';
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValid(int row, int col, char[][] board, char c){
        for(int i = 0; i < board.length; i++){
            // if(i != col)
            if(board[row][i] == c) return false;
            // if(i != row)
            if(board[i][col] == c) return false;
            // if(board[3*(row/3) + i/3][3*(col/3) + i%3] != board[row][col])
            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == c) return false;
        }
        return true;
    }
}
