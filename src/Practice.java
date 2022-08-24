import java.util.HashMap;

public class Practice {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), 0);
        }
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) < 2){
                if(map.get(s.charAt(i)) > 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}