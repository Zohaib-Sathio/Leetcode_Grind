import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Not getting any solution!!!
public class PartitionLabels_763 {

//    traverse the string record the last index of each char.
//    using pointer to record end of the current sub string.
    public List<Integer> partitionLabels2(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char

        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, map[S.charAt(i)-'a']);
            if(last == i){
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }
    public static List<Integer> partitionLabels(String s){
        int totalPartitioned = 1;
        int totalSum = 0 ;
        List<Integer> list = new ArrayList<>();
        while (totalSum != s.length()){
            int index = totalPartitioned;
            while (index <= totalPartitioned){
                char currChar = s.charAt(index);
                for (int i = s.length()-1; i >= totalPartitioned ; i--) {
                    if(s.charAt(i) == currChar){
                        totalPartitioned = Math.max(totalPartitioned, i + 1);
                        break;
                    }
                }
                index++;
            }
            System.out.println(totalPartitioned);
            break;
//            list.add(totalPartitioned);
//            totalSum += totalPartitioned;
        }

        return list;
    }
    public static void main(String[] args) {
//        String s = "ababcbacacdefegdehijhklij";
        String s = "acacdede";
        System.out.println(partitionLabels(s));
    }
}
