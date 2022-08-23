package LeetcodeFirstMonth;

public class FinalValueOfVariableAfterPerformingOperations_2011 {
    public static int applyOperations(String[] operations){
//        Runtime: 1 ms, faster than 96.59% of Java online submissions for Final Value of Variable After Performing Operations.
//                Memory Usage: 43.9 MB, less than 10.29% of Java online submissions for Final Value of Variable After Performing Operations.
        int X = 0;
        for(String operation : operations){
            if(operation.charAt(1) == '-'){
                X--;
            }
//            else if(operation.charAt(1) == '+'){  //Because only 2 possibilities
            else{
                X++;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String[] operations = {"++X", "X++", "++X"};
        System.out.println(applyOperations(operations));
    }
}
