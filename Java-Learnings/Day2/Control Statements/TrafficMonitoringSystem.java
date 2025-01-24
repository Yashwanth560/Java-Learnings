import java.util.Scanner;

public class TrafficMonitoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVehicles = 0;

        for (int i = 1; i <= 12; i++) { // 12 intervals of 5 minutes in an hour
            System.out.print("Enter the number of vehicles in interval " + i + ": ");
            int vehicles = scanner.nextInt();
            totalVehicles += vehicles;
        }

        System.out.println("Total vehicles in an hour: " + totalVehicles);
        System.out.println("Average vehicles per interval: " + (totalVehicles / 12.0));
        scanner.close();
    }
}
