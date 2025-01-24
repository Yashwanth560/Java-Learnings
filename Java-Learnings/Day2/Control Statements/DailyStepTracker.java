import java.util.Scanner;

public class DailyStepTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        for (int i = 1; i <= 7; i++) { // 7 days
            System.out.print("Enter steps for Day " + i + ": ");
            int steps = scanner.nextInt();
            totalSteps += steps;
        }

        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Average Steps per Day: " + (totalSteps / 7.0));
        scanner.close();
    }
}
