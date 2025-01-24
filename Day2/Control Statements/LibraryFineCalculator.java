import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();

        for (int i = 1; i <= numBooks; i++) {
            System.out.print("Enter the overdue days for Book " + i + ": ");
            int overdueDays = scanner.nextInt();

            double fine = 0;
            if (overdueDays <= 7) {
                fine = overdueDays * 1;
            } else {
                fine = 7 * 1 + (overdueDays - 7) * 2;
            }

            System.out.println("Fine for Book " + i + ": $" + fine);
        }

        scanner.close();
    }
}
