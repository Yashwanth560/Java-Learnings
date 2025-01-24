import java.util.Scanner;

public class CinemaSeatReservation {
    public static void main(String[] args) {
        char[][] seats = new char[5][5]; // 5x5 cinema seating
        Scanner scanner = new Scanner(System.in);

        // Initialize all seats as 'A' (Available)
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'A';
            }
        }

        while (true) {
            System.out.println("\nCinema Seat Map (A=Available, R=Reserved):");
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nEnter row (1-5) to reserve or 0 to exit: ");
            int row = scanner.nextInt();
            if (row == 0) break;

            System.out.print("Enter column (1-5): ");
            int column = scanner.nextInt();

            if (seats[row - 1][column - 1] == 'A') {
                seats[row - 1][column - 1] = 'R';
                System.out.println("Seat reserved successfully!");
            } else {
                System.out.println("Seat already reserved. Try another seat.");
            }
        }

        scanner.close();
    }
}
