package Weekly_Contest.WC_343;

public class determine_the_winner_of_a_bowling_game_WC_343 {
    public int isWinner(int[] player1, int[] player2) {
        int sum1 = 0;
        int sum2 = 0;
        int first = 0, second = 0;
        for(int i = 0; i < player1.length; i++){
            if(i == 0){
                sum1 += player1[i];
            }
            else if(i == 1){
                if(player1[i-1] == 10){
                    sum1 = sum1 + (player1[i] * 2);
                    first = player1[i-1];
                    second = player1[i];
                }
                else{
                    sum1 = sum1 + player1[i];
                    first = player1[i-1];
                    second = player1[i];
                }
            }
            else if(i > 1){
                if(first == 10 || second == 10){
                    sum1 = sum1 + (player1[i] * 2);
                }
                else{
                    sum1 = sum1 + player1[i];
                }
                first = second;
                second = player1[i];
            }
        }
        first = 0;
        second = 0;


        for(int i = 0; i < player2.length; i++){
            if(i == 0){
                sum2 += player2[i];
            }
            else if(i == 1){
                if(player2[i-1] == 10){
                    sum2 = sum2 + (player2[i] * 2);
                    first = player2[i-1];
                    second = player2[i];
                }
                else{
                    sum2 = sum2 + player2[i];
                    first = player2[i-1];
                    second = player2[i];
                }
            }
            else if(i > 1){
                if(first == 10 || second == 10){
                    sum2 = sum2 + (player2[i] * 2);
                }
                else{
                    sum2 = sum2 + player2[i];
                }
                first = second;
                second = player2[i];
            }
        }



        if(sum1 == sum2){
            return 0;
        }
        else if(sum1 > sum2){
            return 1;
        }
        else{
            return 2;
        }
    }
}
