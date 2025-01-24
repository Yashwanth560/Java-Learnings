import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int positions = scanner.nextInt();

        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + n - positions) % n] = arr[i];
        }

        System.out.println("Array after rotation:");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
