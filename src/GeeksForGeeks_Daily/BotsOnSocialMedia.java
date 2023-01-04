package GeeksForGeeks_Daily;

import java.util.HashSet;

public class BotsOnSocialMedia {
    public static int solve(int N, String S) {
        // code here
        HashSet<Character> set = new HashSet<>();
        int distinct = 0;
        int bots = 0;
        for(int i = 0; i < N; i++){
            if(!set.contains(S.charAt(i))){
                set.add(S.charAt(i));
                distinct++; }

            if(i % 2 == 0){
                if(isPrime(distinct)){
                    bots++;
                }
            }
        }
        return bots;
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
