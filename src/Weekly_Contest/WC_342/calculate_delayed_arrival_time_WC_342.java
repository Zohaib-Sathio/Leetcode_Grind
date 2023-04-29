package Weekly_Contest.WC_342;

public class calculate_delayed_arrival_time_WC_342 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int num = arrivalTime + delayedTime;
        if(num > 23){
            num = num % 24;
        }
        return num;
    }
}
