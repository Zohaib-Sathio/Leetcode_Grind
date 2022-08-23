package LeetcodeFirstMonth;

import java.util.Arrays;


public class ExecutionOfAllSuffixInstructionsStayingInGrid_2120 {

//    Runtime: 96 ms, faster than 21.35% of Java online submissions for Execution of All Suffix Instructions Staying in a Grid.
//    Memory Usage: 46.6 MB, less than 34.57% of Java online submissions for Execution of All Suffix Instructions Staying in a Grid.
    public static int[] moveRobot(int gridNumber, int[] startPos, String instructions){
        int[] moves = new int[instructions.length()];

        int[] temp = {startPos[0], startPos[1]};

        //Trying a new approach and efficient and less complicated
//        int[][] grid = new int[gridNumber][gridNumber];
//        for (int i = 0; i < gridNumber; i++) {
//            for (int j = 0; j < gridNumber; j++) {
//                grid[i][j] = 0;
//            }
//        }
//        grid[startPos[0]][startPos[1]] = 1;


        //R R D D U L
        for (int i = 0; i < instructions.length(); i++) {
            int totalMoves = 0;
            for (int j = i; j < instructions.length(); j++) {


                if (instructions.charAt(j) == 'L'){
                    if(startPos[1] == 0){
                        break;
                    }
                    startPos[1] -= 1;
                    totalMoves++;
                }
                else if (instructions.charAt(j) == 'R'){
                    if(startPos[1] == gridNumber-1){
                        break;
                    }
                    startPos[1] += 1;
                    totalMoves++;
                }
                else if (instructions.charAt(j) == 'U'){
                    if(startPos[0] == 0){
                        break;
                    }
                    startPos[0] -= 1;
                    totalMoves++;
                }
                else if (instructions.charAt(j) == 'D'){
                    if(startPos[0] == gridNumber-1){
                        break;
                    }
                    startPos[0] += 1;
                    totalMoves++;
                }
            }
            moves[i] = totalMoves;
            startPos[0] = temp[0];
            startPos[1] = temp[1];
        }



        return moves;
    }
    public static void main(String[] args) {
        int n = 1;
        int[] startPos = {0, 0};
        String instructions = "LURD";
        System.out.println(Arrays.toString(moveRobot(n, startPos, instructions)));
    }
}
