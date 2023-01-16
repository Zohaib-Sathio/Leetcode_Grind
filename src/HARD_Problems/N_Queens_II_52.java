package HARD_Problems;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_II_52 {
    /*
    Runtime
2 ms
Beats
83.16%
Memory
39.1 MB
Beats
87.14%
     */
    public int totalNQueens(int n) {
        int totalCount = 0;
        List<Integer> list = new ArrayList();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                board[i][k] = '.';
            }
        }
        solve(0, board, list, n);
        return list.size();
    }
    private static void solve(int col, char[][] board, List<Integer> list, int n){
        if(col == n){
            list.add(1);
            return;
        }
        for(int row = 0; row < n ; row++){
            if(isPossible(row, col, board)){
                board[row][col] = 'Q';
                solve(col+1, board, list, n);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isPossible(int row, int col, char[][] board){
        int rowDup = row;
        int colDup = col;

        while(row >= 0 && col >= 0){
            if(board[row--][col--] == 'Q') return false;
        }
        row = rowDup;
        col = colDup;

        while(col >= 0){
            if(board[row][col--] == 'Q') return false;
        }
        row = rowDup;
        col = colDup;

        while(row < board.length && col >= 0){
            if(board[row++][col--] == 'Q') return false;
        }
        return true;

    }
}
