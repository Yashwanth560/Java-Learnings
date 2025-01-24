import java.util.concurrent.TimeUnit;

public class OnlineExamTimer {
    public static void main(String[] args) throws InterruptedException {
        int timeRemaining = 5; // 5 minutes

        while (timeRemaining > 0) {
            System.out.println("Time remaining: " + timeRemaining + " minutes");
            TimeUnit.MINUTES.sleep(1); // Wait for 1 minute
            timeRemaining--;
        }

        System.out.println("Time is up! Submit your answers.");
    }
}
