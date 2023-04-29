package Weekly_Contest.WC_342;

public class sum_multiples_WC_342 {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i%3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
