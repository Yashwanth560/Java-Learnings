import java.util.HashSet;
import java.util.Random;

public class LotteryNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> lotteryNumbers = new HashSet<>();

        while (lotteryNumbers.size() < 5) { // Generate 5 unique numbers
            int number = random.nextInt(50) + 1; // Numbers between 1 and 50
            lotteryNumbers.add(number);
        }

        System.out.println("Your Lottery Numbers: " + lotteryNumbers);
    }
}
