import java.util.Scanner;

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        int[][] attendance = new int[n][7]; // 7 days for a week

        for (int i = 0; i < n; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + " (1 for Present, 0 for Absent):");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                attendance[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Attendance Summary:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
