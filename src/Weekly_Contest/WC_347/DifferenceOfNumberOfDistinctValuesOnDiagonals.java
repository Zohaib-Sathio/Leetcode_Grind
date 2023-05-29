package Weekly_Contest.WC_347;

import java.util.HashSet;

public class DifferenceOfNumberOfDistinctValuesOnDiagonals {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        for(int r = 0; r < ans.length; r++){
            for(int c = 0; c < ans[0].length; c++){
                int value = findValue(r, c, grid);
                ans[r][c] = value;
            }
        }
        return ans;
    }
    public static int findValue(int r, int c, int[][] grid){
        HashSet<Integer> leftDiagonal = new HashSet<Integer>();
        HashSet<Integer> rightDiagonal = new HashSet<Integer>();
        int temp1 = r;
        int temp2 = c;
        r--;
        c--;

        while(r >= 0 && c >= 0){
            leftDiagonal.add(grid[r][c]);
            r--;
            c--;
        }
        temp1++;
        temp2++;
        while(temp1 < grid.length && temp2 < grid[0].length){
            rightDiagonal.add(grid[temp1][temp2]);
            temp1++;
            temp2++;
        }
        if(rightDiagonal.size() > leftDiagonal.size()) return rightDiagonal.size() - leftDiagonal.size();
        else return leftDiagonal.size() - rightDiagonal.size();
    }
}
