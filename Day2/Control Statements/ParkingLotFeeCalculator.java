import java.util.Scanner;

public class ParkingLotFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        for (int i = 1; i <= numVehicles; i++) {
            System.out.print("Enter hours parked for Vehicle " + i + ": ");
            int hours = scanner.nextInt();

            double fee = 0;
            if (hours <= 5) {
                fee = hours * 2; // $2/hour for first 5 hours
            } else {
                fee = 5 * 2 + (hours - 5) * 1; // $1/hour for additional hours
            }

            System.out.println("Parking Fee for Vehicle " + i + ": $" + fee);
        }

        scanner.close();
    }
}
