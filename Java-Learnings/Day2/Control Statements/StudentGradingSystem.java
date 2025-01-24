import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int totalGrades = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for Student " + i + ": ");
            int grade = scanner.nextInt();
            totalGrades += grade;

            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
            }
        }

        double average = (double) totalGrades / numStudents;
        System.out.println("Average Grade: " + average);

        scanner.close();
    }
}
